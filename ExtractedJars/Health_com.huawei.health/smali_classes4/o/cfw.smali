.class public Lo/cfw;
.super Landroid/widget/ListView;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 21
    return-void
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 29
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 31
    :sswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v2, v0

    .line 32
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v3, v0

    .line 33
    invoke-virtual {p0, v2, v3}, Lo/cfw;->pointToPosition(II)I

    move-result v4

    .line 34
    const/4 v0, -0x1

    if-ne v4, v0, :cond_0

    .line 35
    goto :goto_0

    .line 37
    :cond_0
    if-nez v4, :cond_2

    .line 38
    invoke-virtual {p0}, Lo/cfw;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v4, v0, :cond_1

    .line 40
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_offlinemap_common_ui_dialog_listview_shape:I

    invoke-virtual {p0, v0}, Lo/cfw;->setSelector(I)V

    goto :goto_0

    .line 43
    :cond_1
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_offlinemap_common_ui_dialog_list_first_item_shape:I

    invoke-virtual {p0, v0}, Lo/cfw;->setSelector(I)V

    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {p0}, Lo/cfw;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v4, v0, :cond_3

    .line 47
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_offlinemap_common_ui_dialog_list_last_item_shape:I

    invoke-virtual {p0, v0}, Lo/cfw;->setSelector(I)V

    goto :goto_0

    .line 50
    :cond_3
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_offlinemap_common_ui_dialog_list_middle_item_shape:I

    invoke-virtual {p0, v0}, Lo/cfw;->setSelector(I)V

    .line 53
    .line 57
    :goto_0
    :sswitch_1
    invoke-super {p0, p1}, Landroid/widget/ListView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method
