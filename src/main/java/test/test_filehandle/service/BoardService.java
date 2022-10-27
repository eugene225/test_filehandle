package test.test_filehandle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.test_filehandle.entity.Board;
import test.test_filehandle.repository.BoardRepository;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    //글 작성 처리
    public void write(Board board) {
        boardRepository.save(board);
    }

    //게시글 리스트 처리
    public List<Board> boardList() {
        return boardRepository.findAll();
    }

    //특정 게시글 불러오기
    public Board boardView(Integer id){
        return boardRepository.findById(id).get();
    }
}
