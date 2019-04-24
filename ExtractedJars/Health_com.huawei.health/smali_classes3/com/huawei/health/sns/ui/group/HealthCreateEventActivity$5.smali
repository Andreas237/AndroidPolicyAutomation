.class Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V
    .locals 0

    .line 258
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$5;->d:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 6

    .line 271
    invoke-static {p1}, Lo/bhs;->a(Landroid/text/Editable;)Z

    .line 272
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$5;->d:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_description_count:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 273
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v4

    .line 274
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/16 v1, 0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 275
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$5;->d:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->c(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 277
    const/16 v0, 0x64

    if-lt v4, v0, :cond_0

    .line 278
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v0

    const/16 v1, 0x64

    invoke-interface {p1, v1, v0}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 279
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$5;->d:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->c(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 280
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$5;->d:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->b(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->round_rectangle_bg_warning:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 281
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$5;->d:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->c(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$5;->d:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->a(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->group_edittext_warning:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 283
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$5;->d:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->c(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 284
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$5;->d:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->b(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->round_rectangle_bg:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 285
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$5;->d:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->c(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$5;->d:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->a(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->group_hint_text_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 287
    :goto_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 262
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 267
    return-void
.end method
