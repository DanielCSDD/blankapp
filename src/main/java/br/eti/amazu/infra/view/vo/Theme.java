package br.eti.amazu.infra.view.vo;

import java.util.ArrayList;
import java.util.List;

import br.eti.amazu.component.pworld.domain.AbstractEntity;

public class Theme extends AbstractEntity<Object> {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String value;
	private List<Theme> themes;

	public Theme(Long id, String name, String value) {
		this.id = id;
		this.name = name;
		this.value = value;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<Theme> getThemes() {
		this.themes = new ArrayList<>();
		this.themes.add(new Theme(0L, "Aristo", "aristo"));
		this.themes.add(new Theme(1L, "Nova-Light", "nova-light"));
		this.themes.add(new Theme(2L, "Nova-Dark", "nova-dark"));
		this.themes.add(new Theme(4L, "Nova-Colored", "nova-colored"));
		this.themes.add(new Theme(5L, "Luna-Blue", "luna-blue"));
		this.themes.add(new Theme(6L, "Luna-Amber", "luna-amber"));
		this.themes.add(new Theme(7L, "Luna-Green", "luna-green"));
		this.themes.add(new Theme(8L, "Luna-Pink", "luna-pink"));
		this.themes.add(new Theme(9L, "Omega", "omega"));
		return themes;
	}

	public void setThemes(List<Theme> themes) {
		this.themes = themes;
	}
}
