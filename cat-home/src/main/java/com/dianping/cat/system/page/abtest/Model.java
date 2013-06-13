package com.dianping.cat.system.page.abtest;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.unidal.web.mvc.ViewModel;

import com.dainping.cat.consumer.dal.report.Project;
import com.dianping.cat.abtest.spi.ABTestEntity;
import com.dianping.cat.home.dal.abtest.Abtest;
import com.dianping.cat.home.dal.abtest.AbtestRun;
import com.dianping.cat.home.dal.abtest.GroupStrategy;
import com.dianping.cat.system.SystemPage;

public class Model extends ViewModel<SystemPage, Action, Context> {
	private String m_domain;

	private Date m_date;

	private ABTestEntity m_entity;

	private List<ABTestReport> m_reports;

	private int m_totalPages;

	private int m_createdCount;

	private int m_readyCount;

	private int m_runningCount;

	private int m_terminatedCount;

	private int m_suspendedCount;

	private Map<String, List<Project>> m_projectMap;

	private List<GroupStrategy> m_groupStrategyList;

	private AbtestDaoModel m_abtest;

	private String m_abtestModel;

	public Model(Context ctx) {
		super(ctx);
	}

	public Date getDate() {
		return m_date;
	}

	public void setDate(Date date) {
		m_date = date;
	}

	@Override
	public Action getDefaultAction() {
		return Action.VIEW;
	}

	public String getDomain() {
		return m_domain;
	}

	public void setDomain(String domain) {
		m_domain = domain;
	}

	public ABTestEntity getEntity() {
		return m_entity;
	}

	public void setEntity(ABTestEntity entity) {
		m_entity = entity;
	}

	public List<ABTestReport> getReports() {
		return m_reports;
	}

	public void setReports(List<ABTestReport> reports) {
		m_reports = reports;
	}

	public int getTotalPages() {
		return m_totalPages;
	}

	public void setTotalPages(int totalPages) {
		m_totalPages = totalPages;
	}

	public int getCreatedCount() {
		return m_createdCount;
	}

	public void setCreatedCount(int createdCount) {
		m_createdCount = createdCount;
	}

	public int getReadyCount() {
		return m_readyCount;
	}

	public void setReadyCount(int readyCount) {
		m_readyCount = readyCount;
	}

	public int getRunningCount() {
		return m_runningCount;
	}

	public void setRunningCount(int runningCount) {
		m_runningCount = runningCount;
	}

	public int getTerminatedCount() {
		return m_terminatedCount;
	}

	public void setTerminatedCount(int terminatedCount) {
		m_terminatedCount = terminatedCount;
	}

	public int getSuspendedCount() {
		return m_suspendedCount;
	}

	public void setSuspendedCount(int suspendedCount) {
		m_suspendedCount = suspendedCount;
	}

	public Map<String, List<Project>> getProjectMap() {
		return m_projectMap;
	}

	public void setProjectMap(Map<String, List<Project>> projectMap) {
		m_projectMap = projectMap;
	}

	public List<GroupStrategy> getGroupStrategyList() {
		return m_groupStrategyList;
	}

	public void setGroupStrategyList(List<GroupStrategy> groupStrategyList) {
		m_groupStrategyList = groupStrategyList;
	}

	public AbtestDaoModel getAbtest() {
		return m_abtest;
	}

	public void setAbtest(AbtestDaoModel abtest) {
		m_abtest = abtest;
	}

	public String getAbtestModel() {
		return m_abtestModel;
	}

	public void setAbtestModel(String abtestModel) {
		m_abtestModel = abtestModel;
	}

	public static class AbtestDaoModel {

		private Abtest m_abtest;

		private AbtestRun m_run;

		public AbtestDaoModel(Abtest abtest, AbtestRun abtestRun) {
			super();
			m_abtest = abtest;
			m_run = abtestRun;
		}

		public Abtest getAbtest() {
			return m_abtest;
		}

		public void setAbtest(Abtest abtest) {
			m_abtest = abtest;
		}

		public AbtestRun getRun() {
			return m_run;
		}

		public void setRun(AbtestRun run) {
			m_run = run;
		}

		public String getDescription() {
			return m_abtest.getDescription();
		}

		public int getGroupStrategy() {
			return m_abtest.getGroupStrategy();
		}

		public String getName() {
			return m_abtest.getName();
		}

		public String getOwner() {
			return m_abtest.getOwner();
		}

		public int getCaseId() {
			return m_run.getCaseId();
		}

		public String getDomains() {
			return m_run.getDomains();
		}

		public Date getEndDate() {
			return m_run.getEndDate();
		}

		public int getId() {
			return m_run.getId();
		}

		public Date getStartDate() {
			return m_run.getStartDate();
		}

		public String getStrategyConfiguration() {
			return m_run.getStrategyConfiguration();
		}

	}
}
