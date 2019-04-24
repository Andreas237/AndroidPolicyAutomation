.class public Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$KeyBoardOnClickListener;
    }
.end annotation


# instance fields
.field private digit_collapse:Landroid/widget/LinearLayout;

.field private digit_del:Landroid/widget/LinearLayout;

.field private digit_tvs:[Landroid/widget/TextView;

.field private mContext:Landroid/content/Context;

.field private mIsNumberKeyShuffle:Z

.field private mKeyBoardOnClickListener:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$KeyBoardOnClickListener;

.field private mNumKeyList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 68
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mIsNumberKeyShuffle:Z

    .line 45
    const/16 v0, 0xa

    new-array v0, v0, [Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    .line 69
    iput-object p1, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mContext:Landroid/content/Context;

    .line 70
    invoke-direct {p0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->init()V

    .line 71
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 75
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mIsNumberKeyShuffle:Z

    .line 45
    const/16 v0, 0xa

    new-array v0, v0, [Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    .line 76
    sget-object v0, Lcom/huawei/paycommonbase/R$styleable;->hwkeybroad_attr:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 77
    sget v0, Lcom/huawei/paycommonbase/R$styleable;->hwkeybroad_attr_shuffle:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mIsNumberKeyShuffle:Z

    .line 78
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 79
    iput-object p1, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mContext:Landroid/content/Context;

    .line 80
    invoke-direct {p0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->init()V

    .line 81
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;)Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$KeyBoardOnClickListener;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mKeyBoardOnClickListener:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$KeyBoardOnClickListener;

    return-object v0
.end method

.method private createNumKey()Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 331
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 332
    const/4 v2, 0x0

    :goto_0
    const/16 v0, 0xa

    if-ge v2, v0, :cond_0

    .line 334
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 332
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 336
    :cond_0
    return-object v1
.end method

.method private init()V
    .locals 1

    .line 88
    invoke-direct {p0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->createNumKey()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mNumKeyList:Ljava/util/ArrayList;

    .line 91
    iget-boolean v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mIsNumberKeyShuffle:Z

    if-eqz v0, :cond_0

    .line 93
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mNumKeyList:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 96
    :cond_0
    invoke-direct {p0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->initViews()V

    .line 97
    return-void
.end method

.method private initViews()V
    .locals 5

    .line 153
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mContext:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 154
    sget v0, Lcom/huawei/paycommonbase/R$layout;->hwpay_keyboard:I

    invoke-virtual {v4, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 155
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    sget v1, Lcom/huawei/paycommonbase/R$id;->digit_tv0:I

    invoke-virtual {p0, v1}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 156
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    sget v1, Lcom/huawei/paycommonbase/R$id;->digit_tv1:I

    invoke-virtual {p0, v1}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 157
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    sget v1, Lcom/huawei/paycommonbase/R$id;->digit_tv2:I

    invoke-virtual {p0, v1}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 158
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    sget v1, Lcom/huawei/paycommonbase/R$id;->digit_tv3:I

    invoke-virtual {p0, v1}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 159
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    sget v1, Lcom/huawei/paycommonbase/R$id;->digit_tv4:I

    invoke-virtual {p0, v1}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 160
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    sget v1, Lcom/huawei/paycommonbase/R$id;->digit_tv5:I

    invoke-virtual {p0, v1}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 161
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    sget v1, Lcom/huawei/paycommonbase/R$id;->digit_tv6:I

    invoke-virtual {p0, v1}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    .line 162
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    sget v1, Lcom/huawei/paycommonbase/R$id;->digit_tv7:I

    invoke-virtual {p0, v1}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    .line 163
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    sget v1, Lcom/huawei/paycommonbase/R$id;->digit_tv8:I

    invoke-virtual {p0, v1}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    .line 164
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    sget v1, Lcom/huawei/paycommonbase/R$id;->digit_tv9:I

    invoke-virtual {p0, v1}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    .line 167
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mNumKeyList:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 168
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mNumKeyList:Ljava/util/ArrayList;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 169
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mNumKeyList:Ljava/util/ArrayList;

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 170
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mNumKeyList:Ljava/util/ArrayList;

    const/4 v3, 0x3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mNumKeyList:Ljava/util/ArrayList;

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mNumKeyList:Ljava/util/ArrayList;

    const/4 v3, 0x5

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 173
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mNumKeyList:Ljava/util/ArrayList;

    const/4 v3, 0x6

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 174
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mNumKeyList:Ljava/util/ArrayList;

    const/4 v3, 0x7

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 175
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mNumKeyList:Ljava/util/ArrayList;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 176
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mNumKeyList:Ljava/util/ArrayList;

    const/16 v3, 0x9

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 177
    sget v0, Lcom/huawei/paycommonbase/R$id;->digit_collapse:I

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_collapse:Landroid/widget/LinearLayout;

    .line 178
    sget v0, Lcom/huawei/paycommonbase/R$id;->digit_del:I

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_del:Landroid/widget/LinearLayout;

    .line 180
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 181
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 182
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 183
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 184
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 185
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 186
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 187
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 188
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 189
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 190
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_collapse:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 191
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_del:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 192
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_del:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$1;

    invoke-direct {v1, p0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$1;-><init>(Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 204
    return-void
.end method

.method private onNumKeyClick(I)V
    .locals 2

    .line 318
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mKeyBoardOnClickListener:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$KeyBoardOnClickListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 321
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mKeyBoardOnClickListener:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$KeyBoardOnClickListener;

    iget-object v1, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mNumKeyList:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$KeyBoardOnClickListener;->onNumKeyClick(I)V

    .line 323
    :cond_0
    return-void
.end method


# virtual methods
.method public getNumKeyShuffle()Z
    .locals 1

    .line 119
    iget-boolean v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mIsNumberKeyShuffle:Z

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 255
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/paycommonbase/R$id;->digit_tv0:I

    if-ne v0, v1, :cond_0

    .line 257
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->onNumKeyClick(I)V

    goto/16 :goto_0

    .line 259
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/paycommonbase/R$id;->digit_tv1:I

    if-ne v0, v1, :cond_1

    .line 261
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->onNumKeyClick(I)V

    goto/16 :goto_0

    .line 263
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/paycommonbase/R$id;->digit_tv2:I

    if-ne v0, v1, :cond_2

    .line 265
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->onNumKeyClick(I)V

    goto/16 :goto_0

    .line 267
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/paycommonbase/R$id;->digit_tv3:I

    if-ne v0, v1, :cond_3

    .line 269
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->onNumKeyClick(I)V

    goto/16 :goto_0

    .line 271
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/paycommonbase/R$id;->digit_tv4:I

    if-ne v0, v1, :cond_4

    .line 273
    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->onNumKeyClick(I)V

    goto/16 :goto_0

    .line 275
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/paycommonbase/R$id;->digit_tv5:I

    if-ne v0, v1, :cond_5

    .line 277
    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->onNumKeyClick(I)V

    goto/16 :goto_0

    .line 279
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/paycommonbase/R$id;->digit_tv6:I

    if-ne v0, v1, :cond_6

    .line 281
    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->onNumKeyClick(I)V

    goto :goto_0

    .line 283
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/paycommonbase/R$id;->digit_tv7:I

    if-ne v0, v1, :cond_7

    .line 285
    const/4 v0, 0x7

    invoke-direct {p0, v0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->onNumKeyClick(I)V

    goto :goto_0

    .line 287
    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/paycommonbase/R$id;->digit_tv8:I

    if-ne v0, v1, :cond_8

    .line 289
    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->onNumKeyClick(I)V

    goto :goto_0

    .line 291
    :cond_8
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/paycommonbase/R$id;->digit_tv9:I

    if-ne v0, v1, :cond_9

    .line 293
    const/16 v0, 0x9

    invoke-direct {p0, v0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->onNumKeyClick(I)V

    goto :goto_0

    .line 295
    :cond_9
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/paycommonbase/R$id;->digit_collapse:I

    if-ne v0, v1, :cond_a

    .line 297
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->setVisibility(I)V

    .line 298
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mKeyBoardOnClickListener:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$KeyBoardOnClickListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_b

    .line 300
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mKeyBoardOnClickListener:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$KeyBoardOnClickListener;

    invoke-interface {v0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$KeyBoardOnClickListener;->onHideKeyClick()V

    goto :goto_0

    .line 303
    :cond_a
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/paycommonbase/R$id;->digit_del:I

    if-ne v0, v1, :cond_b

    .line 305
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mKeyBoardOnClickListener:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$KeyBoardOnClickListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_b

    .line 307
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mKeyBoardOnClickListener:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$KeyBoardOnClickListener;

    invoke-interface {v0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$KeyBoardOnClickListener;->onDelKeyClick()V

    .line 310
    :cond_b
    :goto_0
    return-void
.end method

.method public setKeyBoardListener(Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$KeyBoardOnClickListener;)V
    .locals 1

    .line 105
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 107
    iput-object p1, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mKeyBoardOnClickListener:Lcom/huawei/pay/ui/widget/HwPayKeyBoardView$KeyBoardOnClickListener;

    .line 109
    :cond_0
    return-void
.end method

.method public setKeyBoardLocked(Z)V
    .locals 4

    .line 225
    if-eqz p1, :cond_1

    .line 227
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    array-length v0, v0

    if-ge v3, v0, :cond_0

    .line 229
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    aget-object v0, v0, v3

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    .line 230
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    aget-object v0, v0, v3

    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/paycommonbase/R$color;->huaweipay_black_a_4C:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 231
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    aget-object v0, v0, v3

    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/paycommonbase/R$color;->keyboard_num_locked_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 227
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 234
    :cond_0
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_collapse:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/paycommonbase/R$color;->keyboard_num_locked_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 235
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_del:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/paycommonbase/R$color;->keyboard_num_locked_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    goto :goto_2

    .line 239
    :cond_1
    const/4 v3, 0x0

    :goto_1
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    array-length v0, v0

    if-ge v3, v0, :cond_2

    .line 241
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    aget-object v0, v0, v3

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    .line 242
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    aget-object v0, v0, v3

    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/paycommonbase/R$color;->primarycolor:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 243
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_tvs:[Landroid/widget/TextView;

    aget-object v0, v0, v3

    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/paycommonbase/R$drawable;->huaweipay_select_item_click:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 239
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 246
    :cond_2
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_collapse:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/paycommonbase/R$drawable;->huaweipay_select_item_click:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 247
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->digit_del:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/paycommonbase/R$drawable;->huaweipay_select_item_click:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 249
    :goto_2
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->invalidate()V

    .line 250
    return-void
.end method

.method public showKeyBoard()V
    .locals 2

    .line 211
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 213
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->setVisibility(I)V

    .line 215
    :cond_0
    return-void
.end method

.method public shuffleNumKey()V
    .locals 1

    .line 129
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mIsNumberKeyShuffle:Z

    .line 130
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mNumKeyList:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 131
    invoke-direct {p0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->initViews()V

    .line 132
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->requestLayout()V

    .line 133
    return-void
.end method

.method public sortNumKey()V
    .locals 1

    .line 142
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mIsNumberKeyShuffle:Z

    .line 143
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->mNumKeyList:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 144
    invoke-direct {p0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->initViews()V

    .line 145
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->requestLayout()V

    .line 146
    return-void
.end method
