.class Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity$a;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;)V
    .locals 0

    .line 272
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity$a;->e:Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 276
    const-string v0, "HealthAboutActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDoubleTapEvent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    const/4 v0, 0x0

    return v0
.end method
