.class public Lcom/ibotta/android/mvp/ui/view/engagement/EngagementViewFactory;
.super Ljava/lang/Object;
.source "EngagementViewFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static fromRewardType(Landroid/content/Context;Lcom/ibotta/api/model/TaskModel$Type;)Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;
    .locals 1

    .line 15
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/engagement/EngagementViewFactory$1;->$SwitchMap$com$ibotta$api$model$TaskModel$Type:[I

    invoke-virtual {p1}, Lcom/ibotta/api/model/TaskModel$Type;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 54
    :pswitch_0
    new-instance p1, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;

    invoke-direct {p1, p0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;-><init>(Landroid/content/Context;)V

    goto :goto_1

    .line 51
    :pswitch_1
    new-instance p1, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;

    invoke-direct {p1, p0}, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;-><init>(Landroid/content/Context;)V

    goto :goto_1

    .line 40
    :pswitch_2
    new-instance p1, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;

    invoke-direct {p1, p0}, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;-><init>(Landroid/content/Context;)V

    goto :goto_1

    .line 37
    :pswitch_3
    new-instance p1, Lcom/ibotta/android/mvp/ui/view/engagement/JoustEngagementView;

    invoke-direct {p1, p0}, Lcom/ibotta/android/mvp/ui/view/engagement/JoustEngagementView;-><init>(Landroid/content/Context;)V

    goto :goto_1

    .line 34
    :pswitch_4
    new-instance p1, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;

    invoke-direct {p1, p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;-><init>(Landroid/content/Context;)V

    goto :goto_1

    .line 26
    :pswitch_5
    new-instance p1, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;

    invoke-direct {p1, p0}, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;-><init>(Landroid/content/Context;)V

    goto :goto_1

    :goto_0
    :pswitch_6
    const/4 p1, 0x0

    :goto_1
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
