.class Lo/egt$c$b;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/egt$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/egt$c$b$b;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/view/LayoutInflater;

.field private c:Landroid/widget/AdapterView$OnItemClickListener;

.field private d:[Ljava/lang/String;

.field private e:[Z


# direct methods
.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;[ZLandroid/widget/AdapterView$OnItemClickListener;)V
    .locals 2

    .line 348
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 349
    iput-object p2, p0, Lo/egt$c$b;->d:[Ljava/lang/String;

    .line 350
    iput-object p3, p0, Lo/egt$c$b;->e:[Z

    .line 351
    iput-object p1, p0, Lo/egt$c$b;->a:Landroid/content/Context;

    .line 352
    iput-object p4, p0, Lo/egt$c$b;->c:Landroid/widget/AdapterView$OnItemClickListener;

    .line 353
    iget-object v0, p0, Lo/egt$c$b;->a:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lo/egt$c$b;->b:Landroid/view/LayoutInflater;

    .line 355
    return-void
.end method

.method static synthetic b(Lo/egt$c$b;)Landroid/widget/AdapterView$OnItemClickListener;
    .locals 1

    .line 331
    iget-object v0, p0, Lo/egt$c$b;->c:Landroid/widget/AdapterView$OnItemClickListener;

    return-object v0
.end method

.method static synthetic c(Lo/egt$c$b;)[Z
    .locals 1

    .line 331
    iget-object v0, p0, Lo/egt$c$b;->e:[Z

    return-object v0
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 359
    iget-object v0, p0, Lo/egt$c$b;->d:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 364
    iget-object v0, p0, Lo/egt$c$b;->d:[Ljava/lang/String;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 369
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .line 386
    iget-object v0, p0, Lo/egt$c$b;->d:[Ljava/lang/String;

    aget-object v4, v0, p1

    .line 387
    if-nez p2, :cond_0

    .line 388
    iget-object v0, p0, Lo/egt$c$b;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/commonui/R$layout;->commonui_dialog_single_choice_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 390
    new-instance v3, Lo/egt$c$b$b;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lo/egt$c$b$b;-><init>(Lo/egt$5;)V

    .line 392
    sget v0, Lcom/huawei/ui/commonui/R$id;->contact_name:I

    .line 393
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v3, Lo/egt$c$b$b;->a:Landroid/widget/TextView;

    .line 394
    invoke-virtual {p2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 396
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/egt$c$b$b;

    .line 399
    :goto_0
    iget-object v0, v3, Lo/egt$c$b$b;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 400
    sget v0, Lcom/huawei/ui/commonui/R$id;->chk_selectone:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/CheckBox;

    .line 401
    iput-object v5, v3, Lo/egt$c$b$b;->d:Landroid/widget/CheckBox;

    .line 402
    iget-object v0, v3, Lo/egt$c$b$b;->d:Landroid/widget/CheckBox;

    new-instance v1, Lo/egt$c$b$1;

    invoke-direct {v1, p0, p1, v5}, Lo/egt$c$b$1;-><init>(Lo/egt$c$b;ILandroid/widget/CheckBox;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 419
    iget-object v0, v3, Lo/egt$c$b$b;->d:Landroid/widget/CheckBox;

    iget-object v1, p0, Lo/egt$c$b;->e:[Z

    aget-boolean v1, v1, p1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 420
    return-object p2
.end method
