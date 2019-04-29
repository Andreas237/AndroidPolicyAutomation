.class final Lretrofit/ErrorHandler$1;
.super Ljava/lang/Object;
.source "ErrorHandler.java"

# interfaces
.implements Lretrofit/ErrorHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit/ErrorHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleError(Lretrofit/RetrofitError;)Ljava/lang/Throwable;
    .locals 0

    return-object p1
.end method
