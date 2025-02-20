package apply.model;

import java.util.List;
import java.util.Map;

import apply.domain.ApplyDTO;
import recruitment.domain.RecruitmentDTO;

//입사지원서
public interface ApplyDAO {

	// 입자지원자 목록
	List<ApplyDTO> applyList(RecruitmentDTO recruitmentDTO);

	// 해당 채용공고에 대한 지원자 정보 조회
	Map<String, String> applySelect(Map<String, Integer> map);

}
