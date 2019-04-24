.class Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 212
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    sget-object v1, Lo/dae;->ef:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1"

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->i()V

    .line 214
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v1

    invoke-virtual {v1}, Lo/dgu;->v()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;I)I

    .line 215
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->n(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V

    .line 216
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 217
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)Z

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v2, v2, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->a(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v3, v3, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->b(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v3

    iget-object v4, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v4, v4, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v4}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->c(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v4

    iget-object v5, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v5, v5, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    .line 218
    invoke-static {v5}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->h(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v5

    iget-object v6, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v6, v6, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v6}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->i(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v6

    iget-object v7, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v7, v7, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v7}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->g(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v7

    iget-object v8, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v8, v8, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v8}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->k(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v8

    .line 217
    invoke-virtual/range {v0 .. v8}, Lo/dgu;->c(ZIIIIIII)V

    goto :goto_0

    .line 220
    :cond_0
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)Z

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v2, v2, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->a(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v3, v3, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->b(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v3

    iget-object v4, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v4, v4, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v4}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->c(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v4

    iget-object v5, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v5, v5, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    .line 221
    invoke-static {v5}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->h(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v5

    iget-object v6, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v6, v6, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v6}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->i(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v6

    iget-object v7, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v7, v7, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v7}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->g(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v7

    iget-object v8, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v8, v8, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v8}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->k(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v8

    .line 220
    invoke-virtual/range {v0 .. v8}, Lo/dgu;->d(ZIIIIIII)V

    .line 222
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->o(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/dgu;->d(I)V

    .line 224
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->m(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V

    .line 225
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->q(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V

    .line 226
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->b(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->a(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;I)V

    .line 227
    return-void
.end method
