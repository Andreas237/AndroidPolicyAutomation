.class public Lo/fle;
.super Landroid/support/v7/widget/RecyclerView;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private b:Landroid/content/Context;

.field private c:Z

.field private d:Lo/flb;

.field private e:Z

.field private f:Landroid/content/BroadcastReceiver;

.field private h:Landroid/content/IntentFilter;

.field private i:Z

.field private k:Lo/fld;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 76
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/fle;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 77
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 80
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/fle;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 81
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 84
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/fle;->a:Ljava/util/Map;

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fle;->d:Lo/flb;

    .line 54
    new-instance v0, Lo/fle$4;

    invoke-direct {v0, p0}, Lo/fle$4;-><init>(Lo/fle;)V

    iput-object v0, p0, Lo/fle;->f:Landroid/content/BroadcastReceiver;

    .line 85
    iput-object p1, p0, Lo/fle;->b:Landroid/content/Context;

    .line 86
    sget-object v0, Lhuawei/support/hwrecyclerview/R$styleable;->HwRecyclerView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 88
    sget v0, Lhuawei/support/hwrecyclerview/R$styleable;->HwRecyclerView_scrollTopEnable:I

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lo/fle;->e:Z

    .line 89
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 90
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-le v0, v1, :cond_0

    .line 91
    new-instance v0, Lo/flb;

    invoke-direct {v0}, Lo/flb;-><init>()V

    iput-object v0, p0, Lo/fle;->d:Lo/flb;

    .line 94
    :cond_0
    new-instance v0, Lo/fld;

    new-instance v1, Lo/fle$3;

    invoke-direct {v1, p0}, Lo/fle$3;-><init>(Lo/fle;)V

    invoke-direct {v0, v1}, Lo/fld;-><init>(Lo/fkz$c;)V

    iput-object v0, p0, Lo/fle;->k:Lo/fld;

    .line 101
    return-void
.end method

.method static synthetic a(Lo/fle;)Z
    .locals 1

    .line 30
    iget-boolean v0, p0, Lo/fle;->i:Z

    return v0
.end method

.method private b()V
    .locals 2

    .line 208
    iget-boolean v0, p0, Lo/fle;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fle;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 209
    iget-object v0, p0, Lo/fle;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/fle;->f:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 210
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fle;->c:Z

    .line 212
    :cond_0
    return-void
.end method

.method static synthetic d(Lo/fle;)Lo/fld;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/fle;->k:Lo/fld;

    return-object v0
.end method

.method private d()V
    .locals 5

    .line 195
    iget-boolean v0, p0, Lo/fle;->e:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lo/fle;->c:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/fle;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 196
    iget-object v0, p0, Lo/fle;->h:Landroid/content/IntentFilter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 197
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "com.huawei.intent.action.CLICK_STATUSBAR"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/fle;->h:Landroid/content/IntentFilter;

    .line 199
    :cond_0
    iget-object v0, p0, Lo/fle;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/fle;->f:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lo/fle;->h:Landroid/content/IntentFilter;

    const-string v3, "huawei.permission.CLICK_STATUSBAR_BROADCAST"

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 200
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fle;->c:Z

    .line 202
    :cond_1
    return-void
.end method

.method static synthetic e(Lo/fle;Z)Z
    .locals 0

    .line 30
    iput-boolean p1, p0, Lo/fle;->i:Z

    return p1
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 14

    .line 113
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->draw(Landroid/graphics/Canvas;)V

    .line 114
    invoke-virtual {p0}, Lo/fle;->getChildCount()I

    move-result v4

    .line 115
    invoke-virtual {p0}, Lo/fle;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object v5

    .line 116
    const/4 v6, 0x0

    .line 117
    const/4 v7, 0x0

    .line 118
    const/4 v8, 0x0

    .line 119
    iget-object v0, p0, Lo/fle;->d:Lo/flb;

    if-eqz v0, :cond_0

    .line 120
    iget-object v0, p0, Lo/fle;->d:Lo/flb;

    invoke-virtual {v0, p0}, Lo/flb;->a(Landroid/view/View;)V

    .line 122
    :cond_0
    const/4 v9, 0x0

    :goto_0
    if-ge v9, v4, :cond_5

    .line 123
    invoke-virtual {p0, v9}, Lo/fle;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 124
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    .line 125
    invoke-virtual {p0, v8}, Lo/fle;->getChildAdapterPosition(Landroid/view/View;)I

    move-result v10

    .line 127
    const/4 v0, -0x1

    if-eq v10, v0, :cond_1

    invoke-virtual {v5}, Landroid/support/v7/widget/RecyclerView$Adapter;->getItemCount()I

    move-result v0

    if-lt v10, v0, :cond_2

    .line 128
    :cond_1
    const-string v0, "HwRecyclerView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "the position is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 129
    goto/16 :goto_2

    .line 132
    :cond_2
    invoke-virtual {v5, v10}, Landroid/support/v7/widget/RecyclerView$Adapter;->getItemViewType(I)I

    move-result v11

    .line 133
    iget-object v0, p0, Lo/fle;->a:Ljava/util/Map;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/String;

    .line 134
    if-nez v12, :cond_3

    .line 135
    invoke-virtual {v8}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    .line 136
    invoke-virtual {v8}, Landroid/view/View;->getPaddingRight()I

    move-result v7

    .line 137
    iget-object v0, p0, Lo/fle;->a:Ljava/util/Map;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 139
    :cond_3
    const-string v0, ":"

    invoke-virtual {v12, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v13

    .line 140
    const/4 v0, 0x0

    aget-object v0, v13, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 141
    const/4 v0, 0x1

    aget-object v0, v13, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 143
    :goto_1
    iget-object v0, p0, Lo/fle;->d:Lo/flb;

    if-eqz v0, :cond_4

    .line 144
    iget-object v0, p0, Lo/fle;->d:Lo/flb;

    invoke-virtual {v0, v8, v6, v7}, Lo/flb;->d(Landroid/view/View;II)V

    .line 122
    :cond_4
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 148
    :cond_5
    :goto_2
    return-void
.end method

.method public onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 2

    .line 105
    iget-object v0, p0, Lo/fle;->d:Lo/flb;

    if-eqz v0, :cond_0

    .line 106
    iget-object v0, p0, Lo/fle;->d:Lo/flb;

    iget-object v1, p0, Lo/fle;->b:Landroid/content/Context;

    invoke-virtual {v0, p1, p0, v1}, Lo/flb;->b(Landroid/view/WindowInsets;Landroid/view/View;Landroid/content/Context;)V

    .line 108
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v0

    return-object v0
.end method

.method public onAttachedToWindow()V
    .locals 1

    .line 153
    invoke-super {p0}, Landroid/support/v7/widget/RecyclerView;->onAttachedToWindow()V

    .line 154
    invoke-direct {p0}, Lo/fle;->d()V

    .line 156
    iget-object v0, p0, Lo/fle;->k:Lo/fld;

    invoke-virtual {v0, p0}, Lo/fld;->e(Landroid/view/View;)V

    .line 158
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 170
    invoke-super {p0}, Landroid/support/v7/widget/RecyclerView;->onDetachedFromWindow()V

    .line 171
    invoke-direct {p0}, Lo/fle;->b()V

    .line 173
    iget-object v0, p0, Lo/fle;->k:Lo/fld;

    invoke-virtual {v0}, Lo/fld;->b()V

    .line 175
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 163
    iget-object v0, p0, Lo/fle;->k:Lo/fld;

    invoke-virtual {v0, p1}, Lo/fld;->d(Landroid/view/MotionEvent;)V

    .line 165
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public setScrollTopEnable(Z)V
    .locals 1

    .line 181
    iget-boolean v0, p0, Lo/fle;->e:Z

    if-eq p1, v0, :cond_1

    .line 182
    iput-boolean p1, p0, Lo/fle;->e:Z

    .line 183
    if-eqz p1, :cond_0

    .line 184
    invoke-direct {p0}, Lo/fle;->d()V

    goto :goto_0

    .line 186
    :cond_0
    invoke-direct {p0}, Lo/fle;->b()V

    .line 189
    :cond_1
    :goto_0
    return-void
.end method
