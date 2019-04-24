.class Lo/abu$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/motiondetection/MotionDetectionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/abu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/abu;


# direct methods
.method constructor <init>(Lo/abu;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lo/abu$2;->c:Lo/abu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public notifyMotionRecoResult(Lcom/huawei/motiondetection/MotionRecoResult;)V
    .locals 2

    .line 134
    if-eqz p1, :cond_0

    .line 135
    iget-object v0, p0, Lo/abu$2;->c:Lo/abu;

    iget-object v1, p1, Lcom/huawei/motiondetection/MotionRecoResult;->mMotionExtras:Landroid/os/Bundle;

    invoke-static {v0, v1}, Lo/abu;->d(Lo/abu;Landroid/os/Bundle;)V

    .line 137
    :cond_0
    return-void
.end method
