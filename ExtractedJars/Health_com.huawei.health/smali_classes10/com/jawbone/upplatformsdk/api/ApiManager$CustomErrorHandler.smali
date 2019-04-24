.class Lcom/jawbone/upplatformsdk/api/ApiManager$CustomErrorHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lretrofit/ErrorHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jawbone/upplatformsdk/api/ApiManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "CustomErrorHandler"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/jawbone/upplatformsdk/api/ApiManager$1;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/jawbone/upplatformsdk/api/ApiManager$CustomErrorHandler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleError(Lretrofit/RetrofitError;)Ljava/lang/Throwable;
    .locals 0

    .line 44
    return-object p1
.end method
