# Alpine 기반 이미지 사용
FROM alpine:3.20

# 패키지 업데이트 및 curl, vi, bash 설치
RUN apk update && apk add --no-cache bash curl vim

# 기본 쉘을 bash로 설정 (선택 사항)
CMD ["/bin/bash"]
