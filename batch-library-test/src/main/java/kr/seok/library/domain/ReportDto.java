package kr.seok.library.domain;


import kr.seok.common.excel.annotation.DefaultBodyStyle;
import kr.seok.common.excel.annotation.DefaultHeaderStyle;
import kr.seok.common.excel.annotation.ExcelColumn;
import kr.seok.common.excel.annotation.ExcelColumnStyle;
import kr.seok.common.excel.style.DefaultExcelCellStyle;
import lombok.Data;

@Data
@DefaultHeaderStyle(
        style = @ExcelColumnStyle(
                excelCellStyleClass = DefaultExcelCellStyle.class, enumName = "GREY_HEADER")
)
@DefaultBodyStyle(
        style = @ExcelColumnStyle(
                excelCellStyleClass = DefaultExcelCellStyle.class, enumName = "BODY")
)
public class ReportDto {

    @ExcelColumn(headerName = "도서관 코드")
    private String libraryCd;
    @ExcelColumn(headerName = "도서관 명")
    private String libraryNm;
    @ExcelColumn(headerName = "시도군 코드")
    private String cityCd;
    @ExcelColumn(headerName = "시도군 명")
    private String cityNm;
    @ExcelColumn(headerName = "동읍면 코드")
    private String countryCd;
    @ExcelColumn(headerName = "동읍면 명")
    private String countryNm;
    @ExcelColumn(headerName = "도서관 유형")
    private String libraryType;

}
