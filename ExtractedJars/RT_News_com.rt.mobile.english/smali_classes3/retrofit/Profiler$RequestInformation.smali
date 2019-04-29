.class public final Lretrofit/Profiler$RequestInformation;
.super Ljava/lang/Object;
.source "Profiler.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit/Profiler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RequestInformation"
.end annotation


# instance fields
.field private final baseUrl:Ljava/lang/String;

.field private final contentLength:J

.field private final contentType:Ljava/lang/String;

.field private final method:Ljava/lang/String;

.field private final relativePath:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Lretrofit/Profiler$RequestInformation;->method:Ljava/lang/String;

    .line 57
    iput-object p2, p0, Lretrofit/Profiler$RequestInformation;->baseUrl:Ljava/lang/String;

    .line 58
    iput-object p3, p0, Lretrofit/Profiler$RequestInformation;->relativePath:Ljava/lang/String;

    .line 59
    iput-wide p4, p0, Lretrofit/Profiler$RequestInformation;->contentLength:J

    .line 60
    iput-object p6, p0, Lretrofit/Profiler$RequestInformation;->contentType:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getBaseUrl()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lretrofit/Profiler$RequestInformation;->baseUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getContentLength()J
    .locals 2

    .line 80
    iget-wide v0, p0, Lretrofit/Profiler$RequestInformation;->contentLength:J

    return-wide v0
.end method

.method public getContentType()Ljava/lang/String;
    .locals 1

    .line 85
    iget-object v0, p0, Lretrofit/Profiler$RequestInformation;->contentType:Ljava/lang/String;

    return-object v0
.end method

.method public getMethod()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lretrofit/Profiler$RequestInformation;->method:Ljava/lang/String;

    return-object v0
.end method

.method public getRelativePath()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lretrofit/Profiler$RequestInformation;->relativePath:Ljava/lang/String;

    return-object v0
.end method
