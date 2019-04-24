.class Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/epj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V
    .locals 0

    .line 740
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$13;->c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Dialog;ZIF)V
    .locals 6

    .line 743
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "targetType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " targetValue = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 744
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$13;->c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v0, p3}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->d(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;I)I

    .line 746
    if-eqz p2, :cond_0

    .line 748
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$13;->c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$13;->c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->d(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$13;->c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v2}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->i(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->c(Landroid/content/Context;I)Lo/ehb;

    goto :goto_0

    .line 750
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$13;->c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v0, p4}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->d(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;F)F

    .line 751
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$13;->c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$13;->c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->i(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$13;->c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v2}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->g(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)F

    move-result v2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->d(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;IFZ)V

    .line 753
    :goto_0
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 754
    if-nez p2, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$13;->c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->i(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 755
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 756
    sget-object v0, Lo/dae;->ho:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 757
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 758
    const-string v0, "goalType"

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 759
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 760
    const-string v0, "goalValue"

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$13;->c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->g(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)F

    move-result v1

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 762
    :cond_1
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$13;->c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->d(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 764
    :cond_2
    return-void
.end method
