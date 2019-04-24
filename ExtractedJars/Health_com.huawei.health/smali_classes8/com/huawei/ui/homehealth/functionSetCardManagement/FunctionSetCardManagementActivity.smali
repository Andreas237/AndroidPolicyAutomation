.class public Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Lo/eqp;


# instance fields
.field private a:Landroid/content/Context;

.field public b:Landroid/os/Handler;

.field private c:Lo/eqi;

.field private d:Landroid/support/v7/widget/helper/ItemTouchHelper;

.field private e:Landroid/support/v7/widget/RecyclerView;

.field private f:Z

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/eqn;>;"
        }
    .end annotation
.end field

.field private h:Landroid/widget/ImageView;

.field private i:Landroid/graphics/drawable/Drawable;

.field private k:Landroid/widget/RelativeLayout;

.field private o:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 75
    new-instance v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity$5;-><init>(Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->b:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 5

    .line 91
    const-string v0, "FunctionSetCardManagementActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initListView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    sget v0, Lcom/huawei/ui/homehealth/R$id;->id_recycler_card_management:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->e:Landroid/support/v7/widget/RecyclerView;

    .line 93
    sget v0, Lcom/huawei/ui/homehealth/R$id;->btn_left:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->h:Landroid/widget/ImageView;

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    iget-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->ic_public_black_right_back:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->i:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    .line 98
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->ic_public_black_lift_back:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->i:Landroid/graphics/drawable/Drawable;

    .line 100
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->h:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->i:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 101
    sget v0, Lcom/huawei/ui/homehealth/R$id;->custom_titlebar:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->k:Landroid/widget/RelativeLayout;

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->k:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_card_background:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->e:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity$4;-><init>(Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 116
    new-instance v0, Lo/eqi;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    invoke-direct {v0, v1, v2, p0}, Lo/eqi;-><init>(Ljava/util/List;Landroid/content/Context;Lo/eqp;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->c:Lo/eqi;

    .line 118
    iget-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->e:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 119
    iget-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->c:Lo/eqi;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 124
    new-instance v4, Lo/eqr;

    iget-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->c:Lo/eqi;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    invoke-direct {v4, v0, v1}, Lo/eqr;-><init>(Lo/eqi;Landroid/content/Context;)V

    .line 125
    new-instance v0, Landroid/support/v7/widget/helper/ItemTouchHelper;

    invoke-direct {v0, v4}, Landroid/support/v7/widget/helper/ItemTouchHelper;-><init>(Landroid/support/v7/widget/helper/ItemTouchHelper$Callback;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->d:Landroid/support/v7/widget/helper/ItemTouchHelper;

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->d:Landroid/support/v7/widget/helper/ItemTouchHelper;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/helper/ItemTouchHelper;->attachToRecyclerView(Landroid/support/v7/widget/RecyclerView;)V

    .line 127
    return-void
.end method

.method private b()V
    .locals 17

    .line 130
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    .line 133
    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x2

    const/4 v8, 0x3

    .line 134
    const/4 v9, 0x4

    const/4 v10, 0x5

    .line 136
    const-string v11, ""

    const-string v12, ""

    const-string v13, ""

    const-string v14, ""

    .line 137
    const-string v15, ""

    const-string v16, ""

    .line 139
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 142
    const/4 v5, 0x0

    .line 143
    const/4 v6, 0x1

    .line 144
    const/4 v7, 0x2

    .line 145
    const/4 v8, 0x3

    .line 146
    const/4 v9, 0x4

    .line 147
    const/4 v10, 0x5

    goto :goto_0

    .line 149
    :cond_0
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->f:Z

    if-nez v0, :cond_1

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->o:Z

    if-eqz v0, :cond_2

    .line 150
    :cond_1
    const/4 v5, 0x0

    .line 151
    const/4 v6, 0x1

    .line 152
    const/4 v8, 0x2

    goto :goto_0

    .line 155
    :cond_2
    const/4 v5, 0x0

    .line 156
    const/4 v6, 0x1

    .line 157
    const/4 v7, 0x2

    .line 158
    const/4 v8, 0x3

    .line 162
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/eqq$c;->t:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 163
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/eqq$c;->q:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 164
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->f:Z

    if-nez v0, :cond_4

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->o:Z

    if-nez v0, :cond_4

    .line 165
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/eqq$c;->y:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 167
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/eqq$c;->w:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 168
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_5

    .line 169
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/eqq$c;->s:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 170
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/eqq$c;->r:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 173
    :cond_5
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, ""

    .line 174
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, ""

    .line 175
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, ""

    .line 176
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, ""

    .line 177
    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, ""

    .line 178
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, ""

    .line 179
    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 180
    :cond_6
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, ""

    .line 181
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, ""

    .line 182
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, ""

    .line 183
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, ""

    .line 184
    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 185
    :cond_7
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_d

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->f:Z

    if-nez v0, :cond_8

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->o:Z

    if-eqz v0, :cond_d

    :cond_8
    const-string v0, ""

    .line 187
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    const-string v0, ""

    .line 188
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    const-string v0, ""

    .line 189
    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 191
    :cond_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    new-instance v1, Lo/eqn;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_sleep:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-direct {v1, v2, v3, v4}, Lo/eqn;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    new-instance v1, Lo/eqn;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_weight:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-direct {v1, v2, v3, v4}, Lo/eqn;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_a

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->f:Z

    if-nez v0, :cond_b

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->o:Z

    if-nez v0, :cond_b

    .line 194
    :cond_a
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    new-instance v1, Lo/eqn;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/homehealth/R$string;->IDS_settings_one_level_menu_settings_item_text_id14:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v13}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-direct {v1, v2, v3, v4}, Lo/eqn;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    :cond_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    new-instance v1, Lo/eqn;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_healthdata_heart_bmp:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-direct {v1, v2, v3, v4}, Lo/eqn;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 197
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_c

    .line 199
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    new-instance v1, Lo/eqn;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodpressure:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v15}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-direct {v1, v2, v3, v4}, Lo/eqn;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    new-instance v1, Lo/eqn;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodsugar:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-direct {v1, v2, v3, v4}, Lo/eqn;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    :cond_c
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    goto/16 :goto_1

    .line 206
    :cond_d
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    new-instance v1, Lo/eqn;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_sleep:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3, v5}, Lo/eqn;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    new-instance v1, Lo/eqn;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_weight:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3, v6}, Lo/eqn;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 208
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_e

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->f:Z

    if-nez v0, :cond_f

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->o:Z

    if-nez v0, :cond_f

    .line 209
    :cond_e
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    new-instance v1, Lo/eqn;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/homehealth/R$string;->IDS_settings_one_level_menu_settings_item_text_id14:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3, v7}, Lo/eqn;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    :cond_f
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    new-instance v1, Lo/eqn;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_healthdata_heart_bmp:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3, v8}, Lo/eqn;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_10

    .line 214
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    new-instance v1, Lo/eqn;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodpressure:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3, v9}, Lo/eqn;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    new-instance v1, Lo/eqn;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodsugar:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3, v10}, Lo/eqn;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    :cond_10
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_11

    .line 220
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eqn;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    sget-object v2, Lo/eqq$c;->t:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, v5}, Lo/eqn;->c(Landroid/content/Context;Ljava/lang/String;I)V

    .line 222
    :cond_11
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_12

    .line 223
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eqn;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    sget-object v2, Lo/eqq$c;->q:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, v6}, Lo/eqn;->c(Landroid/content/Context;Ljava/lang/String;I)V

    .line 225
    :cond_12
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_13

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->f:Z

    if-nez v0, :cond_14

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->o:Z

    if-nez v0, :cond_14

    .line 226
    :cond_13
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_14

    .line 227
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eqn;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    sget-object v2, Lo/eqq$c;->y:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, v7}, Lo/eqn;->c(Landroid/content/Context;Ljava/lang/String;I)V

    .line 230
    :cond_14
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v8, v0, :cond_15

    .line 231
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eqn;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    sget-object v2, Lo/eqq$c;->w:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, v8}, Lo/eqn;->c(Landroid/content/Context;Ljava/lang/String;I)V

    .line 233
    :cond_15
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_17

    .line 235
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v9, v0, :cond_16

    .line 236
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eqn;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    sget-object v2, Lo/eqq$c;->s:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, v9}, Lo/eqn;->c(Landroid/content/Context;Ljava/lang/String;I)V

    .line 238
    :cond_16
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v10, v0, :cond_17

    .line 239
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eqn;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    sget-object v2, Lo/eqq$c;->r:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, v10}, Lo/eqn;->c(Landroid/content/Context;Ljava/lang/String;I)V

    .line 243
    :cond_17
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->g:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 245
    :goto_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;)Lo/eqi;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->c:Lo/eqi;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->d:Landroid/support/v7/widget/helper/ItemTouchHelper;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/helper/ItemTouchHelper;->startDrag(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V

    .line 64
    return-void
.end method

.method public c()V
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->c:Lo/eqi;

    invoke-virtual {v0}, Lo/eqi;->notifyDataSetChanged()V

    .line 68
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 50
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 51
    const-string v0, "FunctionSetCardManagementActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    iput-object p0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->v(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->f:Z

    .line 54
    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->o:Z

    .line 55
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->function_set_card_management:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->setContentView(I)V

    .line 57
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->b()V

    .line 58
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a()V

    .line 59
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 72
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 73
    return-void
.end method
