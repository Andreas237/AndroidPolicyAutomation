.class Lo/bev$d;
.super Lo/beu;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bev;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field a:Landroid/widget/TextView;

.field b:Landroid/widget/ImageView;

.field e:Landroid/widget/RelativeLayout;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 167
    invoke-direct {p0}, Lo/beu;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/bev$4;)V
    .locals 0

    .line 167
    invoke-direct {p0}, Lo/bev$d;-><init>()V

    return-void
.end method

.method static synthetic a(Lo/bev$d;Landroid/view/View;)V
    .locals 0

    .line 167
    invoke-direct {p0, p1}, Lo/bev$d;->c(Landroid/view/View;)V

    return-void
.end method

.method private c(Landroid/view/View;)V
    .locals 2

    .line 188
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/bev$d;

    .line 189
    sget v0, Lcom/huawei/android/sns/R$id;->chat_voice_bubble:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v1, Lo/bev$d;->e:Landroid/widget/RelativeLayout;

    .line 190
    sget v0, Lcom/huawei/android/sns/R$id;->iv_voice:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lo/bev$d;->b:Landroid/widget/ImageView;

    .line 191
    sget v0, Lcom/huawei/android/sns/R$id;->voice_record_len:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/bev$d;->a:Landroid/widget/TextView;

    .line 192
    sget v0, Lcom/huawei/android/sns/R$id;->head_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lo/bev$d;->m:Landroid/widget/ImageView;

    .line 193
    sget v0, Lcom/huawei/android/sns/R$id;->chat_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/bev$d;->o:Landroid/widget/TextView;

    .line 194
    sget v0, Lcom/huawei/android/sns/R$id;->checkbox_status_btn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v1, Lo/bev$d;->n:Landroid/widget/CheckBox;

    .line 195
    sget v0, Lcom/huawei/android/sns/R$id;->time_line_viewstub:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, v1, Lo/bev$d;->t:Landroid/view/ViewStub;

    .line 196
    sget v0, Lcom/huawei/android/sns/R$id;->content_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v1, Lo/bev$d;->u:Landroid/widget/LinearLayout;

    .line 197
    return-void
.end method

.method static synthetic c(Lo/bev$d;Landroid/view/View;)V
    .locals 0

    .line 167
    invoke-direct {p0, p1}, Lo/bev$d;->e(Landroid/view/View;)V

    return-void
.end method

.method private e(Landroid/view/View;)V
    .locals 2

    .line 205
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/bev$d;

    .line 206
    sget v0, Lcom/huawei/android/sns/R$id;->chat_voice_bubble:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v1, Lo/bev$d;->e:Landroid/widget/RelativeLayout;

    .line 207
    sget v0, Lcom/huawei/android/sns/R$id;->iv_voice:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lo/bev$d;->b:Landroid/widget/ImageView;

    .line 208
    sget v0, Lcom/huawei/android/sns/R$id;->voice_record_len:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/bev$d;->a:Landroid/widget/TextView;

    .line 209
    sget v0, Lcom/huawei/android/sns/R$id;->head_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lo/bev$d;->m:Landroid/widget/ImageView;

    .line 210
    sget v0, Lcom/huawei/android/sns/R$id;->chat_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/bev$d;->o:Landroid/widget/TextView;

    .line 211
    sget v0, Lcom/huawei/android/sns/R$id;->checkbox_status_btn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v1, Lo/bev$d;->n:Landroid/widget/CheckBox;

    .line 212
    sget v0, Lcom/huawei/android/sns/R$id;->time_line_viewstub:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, v1, Lo/bev$d;->t:Landroid/view/ViewStub;

    .line 213
    sget v0, Lcom/huawei/android/sns/R$id;->content_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v1, Lo/bev$d;->u:Landroid/widget/LinearLayout;

    .line 214
    return-void
.end method
