package com.spring_Boot_test.spring.boot.test.app.converter;

import com.spring_Boot_test.spring.boot.test.app.dto.SkillDto;
import com.spring_Boot_test.spring.boot.test.app.entity.Skill;

public class SkillConverter {
    public static Skill dtoToEntity(SkillDto SkillDto) {
        Skill Skill = new Skill(SkillDto.getSkillName(), null);
        Skill.setSkillId(SkillDto.getSkillId());
        return Skill;
    }
    public static SkillDto entityToDto(Skill skill) {
        return new SkillDto(skill.getSkillId(), skill.getSkillName());
    }
}
