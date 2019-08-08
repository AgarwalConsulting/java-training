FROM golang:alpine AS builder
WORKDIR /app
COPY ./hello.go /app
RUN go build hello.go

FROM scratch
COPY --from=builder /app/hello /
CMD ["/hello"]
