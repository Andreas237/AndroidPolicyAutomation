.class Lo/beq$e;
.super Lo/beu;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/beq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field d:Landroid/widget/TextView;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 208
    invoke-direct {p0}, Lo/beu;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/beq$1;)V
    .locals 0

    .line 208
    invoke-direct {p0}, Lo/beq$e;-><init>()V

    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 2

    .line 238
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/beq$e;

    .line 239
    sget v0, Lcom/huawei/android/sns/R$id;->chat_body_text:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/beq$e;->d:Landroid/widget/TextView;

    .line 240
    sget v0, Lcom/huawei/android/sns/R$id;->head_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lo/beq$e;->m:Landroid/widget/ImageView;

    .line 241
    sget v0, Lcom/huawei/android/sns/R$id;->chat_message_repeat_btn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lo/beq$e;->p:Landroid/widget/ImageView;

    .line 242
    sget v0, Lcom/huawei/android/sns/R$id;->chat_pic_progress:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, v1, Lo/beq$e;->l:Landroid/widget/ProgressBar;

    .line 244
    sget v0, Lcom/huawei/android/sns/R$id;->checkbox_status_btn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v1, Lo/beq$e;->n:Landroid/widget/CheckBox;

    .line 245
    sget v0, Lcom/huawei/android/sns/R$id;->time_line_viewstub:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, v1, Lo/beq$e;->t:Landroid/view/ViewStub;

    .line 246
    sget v0, Lcom/huawei/android/sns/R$id;->content_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v1, Lo/beq$e;->u:Landroid/widget/LinearLayout;

    .line 247
    return-void
.end method

.method static synthetic a(Lo/beq$e;Landroid/view/View;)V
    .locals 0

    .line 208
    invoke-direct {p0, p1}, Lo/beq$e;->e(Landroid/view/View;)V

    return-void
.end method

.method static synthetic c(Lo/beq$e;Landroid/view/View;)V
    .locals 0

    .line 208
    invoke-direct {p0, p1}, Lo/beq$e;->a(Landroid/view/View;)V

    return-void
.end method

.method private e(Landroid/view/View;)V
    .locals 2

    .line 222
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/beq$e;

    .line 223
    sget v0, Lcom/huawei/android/sns/R$id;->chat_body_text:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/beq$e;->d:Landroid/widget/TextView;

    .line 224
    sget v0, Lcom/huawei/android/sns/R$id;->head_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lo/beq$e;->m:Landroid/widget/ImageView;

    .line 225
    sget v0, Lcom/huawei/android/sns/R$id;->chat_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/beq$e;->o:Landroid/widget/TextView;

    .line 226
    sget v0, Lcom/huawei/android/sns/R$id;->checkbox_status_btn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v1, Lo/beq$e;->n:Landroid/widget/CheckBox;

    .line 227
    sget v0, Lcom/huawei/android/sns/R$id;->time_line_viewstub:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, v1, Lo/beq$e;->t:Landroid/view/ViewStub;

    .line 228
    sget v0, Lcom/huawei/android/sns/R$id;->content_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v1, Lo/beq$e;->u:Landroid/widget/LinearLayout;

    .line 229
    return-void
.end method
