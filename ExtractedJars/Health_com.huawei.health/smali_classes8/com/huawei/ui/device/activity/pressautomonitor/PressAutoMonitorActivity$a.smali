.class Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a$a;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)V
    .locals 0

    .line 327
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;->e:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/ViewGroup;I)Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a$a;
    .locals 4

    .line 331
    new-instance v3, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a$a;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;->e:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$layout;->item_press_auto_monitor:I

    .line 332
    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    invoke-direct {v3, p0, v0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a$a;-><init>(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;Landroid/view/View;)V

    .line 334
    return-object v3
.end method

.method public c(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a$a;I)V
    .locals 8

    .line 339
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;->e:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    iget-object v1, p1, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a$a;->b:Landroid/widget/Switch;

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->d(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;Landroid/widget/Switch;)Landroid/widget/Switch;

    .line 340
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;->e:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->a(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Landroid/widget/Switch;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;->e:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->h(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 341
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;->e:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->a(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Landroid/widget/Switch;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;->e:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->i(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Landroid/widget/CompoundButton$OnCheckedChangeListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 342
    iget-object v0, p1, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a$a;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;->e:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    .line 343
    invoke-static {v1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->e(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_press_auto_monitor_relax_range:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    .line 344
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 345
    const-wide/high16 v4, 0x403d000000000000L    # 29.0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    .line 343
    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 342
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 347
    iget-object v0, p1, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a$a;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;->e:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    .line 348
    invoke-static {v1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->e(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_press_auto_monitor_relax_range:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    .line 349
    const-wide/high16 v4, 0x403e000000000000L    # 30.0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 350
    const-wide v4, 0x404d800000000000L    # 59.0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    .line 348
    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 347
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 352
    iget-object v0, p1, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a$a;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;->e:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    .line 353
    invoke-static {v1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->e(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_press_auto_monitor_relax_range:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    .line 354
    const-wide/high16 v4, 0x404e000000000000L    # 60.0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 355
    const-wide v4, 0x4053c00000000000L    # 79.0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    .line 353
    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 352
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 357
    iget-object v0, p1, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a$a;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;->e:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    .line 358
    invoke-static {v1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->e(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_press_auto_monitor_relax_range:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    .line 359
    const-wide/high16 v4, 0x4054000000000000L    # 80.0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 360
    const-wide v4, 0x4058c00000000000L    # 99.0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    .line 358
    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 357
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 362
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 366
    const/4 v0, 0x1

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 327
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a$a;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;->c(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a$a;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 327
    invoke-virtual {p0, p1, p2}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;->b(Landroid/view/ViewGroup;I)Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a$a;

    move-result-object v0

    return-object v0
.end method
