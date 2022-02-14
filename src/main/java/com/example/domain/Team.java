package com.example.domain;

/**
 * 
 * @author hondayuki
 *
 */
public class Team {
	/** ID */
	private Integer id;
	/** リーグ名 */
	private String leagueName;
	/** 球団名 */
	private String teamName;
	/** 本拠地 */
	private String headquarters;
	/** 発足 */
	private String inauration;
	/** 歴史 */
	private String history;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLeagueName() {
		return leagueName;
	}
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getHeadquarters() {
		return headquarters;
	}
	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}
	public String getInauration() {
		return inauration;
	}
	public void setInauration(String inauration) {
		this.inauration = inauration;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", leagueName="
				+ leagueName + ", teamName=" + teamName
				+ ", headquarters=" + headquarters
				+ ", inauration=" + inauration
				+ ", history=" + history + "]";
	}
	
	
	
}
