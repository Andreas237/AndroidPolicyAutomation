.class final enum Lretrofit/RequestInterceptorTape$Command$1;
.super Lretrofit/RequestInterceptorTape$Command;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit/RequestInterceptorTape$Command;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4008
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 41
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lretrofit/RequestInterceptorTape$Command;-><init>(Ljava/lang/String;ILretrofit/RequestInterceptorTape$1;)V

    return-void
.end method


# virtual methods
.method public intercept(Lretrofit/RequestInterceptor$RequestFacade;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 44
    invoke-interface {p1, p2, p3}, Lretrofit/RequestInterceptor$RequestFacade;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    return-void
.end method
