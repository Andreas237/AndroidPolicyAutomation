.class Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V
    .locals 1

    .line 1151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1152
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$b;->c:Ljava/lang/ref/WeakReference;

    .line 1153
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 1157
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyFemaOnClickListener onClick()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$b;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    .line 1159
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1161
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyFemaOnClickListener UserInfoActivity =null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1162
    return-void

    .line 1164
    :cond_0
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;Z)Z

    .line 1165
    invoke-static {v4}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->t(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1166
    invoke-static {v4}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->x(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1168
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v4}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->c(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1169
    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1170
    invoke-static {v4}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->i(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    .line 1171
    return-void

    .line 1174
    :cond_1
    invoke-static {v4}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->z(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1175
    invoke-static {v4}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->z(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 1177
    :cond_2
    invoke-static {v4}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->v(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->j(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1178
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-virtual {v4, v0, v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(II)V

    .line 1179
    invoke-static {v4}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->v(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, v4, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_50_setting_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1180
    invoke-static {v4}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->y(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1181
    return-void
.end method
