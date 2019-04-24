.class Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity$2;->e:Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 1

    .line 91
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    .line 92
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setLooping(Z)V

    .line 93
    return-void
.end method
