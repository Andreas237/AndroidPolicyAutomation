.class Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/NumberPicker$OnValueChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$3;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onValueChange(Landroid/widget/NumberPicker;II)V
    .locals 2

    .line 52
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$3;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    if-lt p3, v0, :cond_0

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$3;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    add-int/lit8 p3, v0, -0x1

    .line 55
    :cond_0
    if-gez p3, :cond_1

    .line 56
    const/4 p3, 0x0

    .line 58
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$3;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$3;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, p3

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    if-eq p2, p3, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$3;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_2

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$3;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->a(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)V

    .line 63
    :cond_2
    return-void
.end method
