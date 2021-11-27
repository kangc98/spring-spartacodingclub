package com.sparta.week08_hw.dto;

import lombok.Getter;
import java.util.List;

@Getter
public class FolderCreateRequestDto {
    List<String> folderNames;
}