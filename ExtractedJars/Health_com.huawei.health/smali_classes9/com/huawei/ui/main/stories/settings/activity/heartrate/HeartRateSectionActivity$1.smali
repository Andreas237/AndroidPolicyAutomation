.class Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$1;
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

    .line 34
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$1;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onValueChange(Landroid/widget/NumberPicker;II)V
    .locals 2

    .line 37
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$1;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    if-lt p3, v0, :cond_0

    .line 38
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$1;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    add-int/lit8 p3, v0, -0x1

    .line 40
    :cond_0
    if-gez p3, :cond_1

    .line 41
    const/4 p3, 0x0

    .line 43
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$1;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$1;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, p3

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->a(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    if-eq p2, p3, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$1;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$1;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_2

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$1;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->c(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)V

    .line 47
    :cond_2
    return-void
.end method
