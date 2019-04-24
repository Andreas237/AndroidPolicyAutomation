.class public Lcom/shopkick/app/launch/TemplateMultiPanelScreen;
.super Lcom/shopkick/app/TemplateScreen;
.source "TemplateMultiPanelScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/shopkick/app/controllers/IPanelControllerCallback;
.implements Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;
    }
.end annotation


# instance fields
.field private backArrow:Landroid/widget/ImageView;

.field private bottomLayout:Landroid/support/constraint/ConstraintLayout;

.field private constraintLayout:Landroid/support/constraint/ConstraintLayout;

.field private currentPanelIndex:I

.field private nextUrl:Ljava/lang/String;

.field private panelDataStorageMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private panelInfoList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;",
            ">;"
        }
    .end annotation
.end field

.field private panelIsTransitioning:Z

.field private subtitleTextView:Lcom/shopkick/app/widget/SKTextView;

.field private topLayout:Landroid/support/constraint/ConstraintLayout;

.field private topLayoutHeight:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 51
    invoke-direct {p0}, Lcom/shopkick/app/TemplateScreen;-><init>()V

    const/4 v0, 0x0

    .line 66
    iput-boolean v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelIsTransitioning:Z

    return-void
.end method

.method static synthetic access$1000(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->expandImage()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)Ljava/util/ArrayList;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelInfoList:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)Lcom/shopkick/app/widget/SKTextView;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->subtitleTextView:Lcom/shopkick/app/widget/SKTextView;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)I
    .locals 0

    .line 51
    iget p0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->currentPanelIndex:I

    return p0
.end method

.method static synthetic access$408(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)I
    .locals 2

    .line 51
    iget v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->currentPanelIndex:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->currentPanelIndex:I

    return v0
.end method

.method static synthetic access$410(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)I
    .locals 2

    .line 51
    iget v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->currentPanelIndex:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->currentPanelIndex:I

    return v0
.end method

.method static synthetic access$500(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->unlockTopLayoutSize()V

    return-void
.end method

.method static synthetic access$600(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->slidePanelInRight()V

    return-void
.end method

.method static synthetic access$702(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;Z)Z
    .locals 0

    .line 51
    iput-boolean p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelIsTransitioning:Z

    return p1
.end method

.method static synthetic access$800(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;Z)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->lockTopLayoutSize(Z)V

    return-void
.end method

.method static synthetic access$900(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->slidePanelInLeft()V

    return-void
.end method

.method private constructPanelInfoList(Ljava/lang/String;)V
    .locals 13

    .line 170
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelInfoList:Ljava/util/ArrayList;

    .line 172
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 p1, 0x0

    move v1, p1

    .line 179
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 181
    :try_start_1
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "panel_type"

    .line 182
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    const-string v4, "panel_text"

    .line 183
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 185
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 186
    invoke-virtual {v2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v5

    .line 187
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 188
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 189
    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v8, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    const/4 v5, 0x4

    if-eq v3, v5, :cond_1

    packed-switch v3, :pswitch_data_0

    const-string v5, "Unsupported panelType"

    .line 211
    invoke-static {p1, v5}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    goto :goto_2

    .line 207
    :pswitch_0
    new-instance v2, Lcom/shopkick/app/controllers/PasswordPanelController;

    iget-object v6, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v7, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 208
    invoke-virtual {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v9

    invoke-virtual {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->getContext()Landroid/content/Context;

    move-result-object v10

    move-object v5, v2

    move-object v11, p0

    move-object v12, p0

    invoke-direct/range {v5 .. v12}, Lcom/shopkick/app/controllers/PasswordPanelController;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/logging/UserEventLogger;Ljava/util/Map;Lcom/shopkick/app/activities/BaseActivity;Landroid/content/Context;Lcom/shopkick/app/controllers/IPanelControllerCallback;Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;)V

    goto :goto_2

    .line 203
    :pswitch_1
    new-instance v2, Lcom/shopkick/app/controllers/EmailPanelController;

    iget-object v6, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v7, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 204
    invoke-virtual {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v9

    invoke-virtual {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->getContext()Landroid/content/Context;

    move-result-object v10

    move-object v5, v2

    move-object v11, p0

    move-object v12, p0

    invoke-direct/range {v5 .. v12}, Lcom/shopkick/app/controllers/EmailPanelController;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/logging/UserEventLogger;Ljava/util/Map;Lcom/shopkick/app/activities/BaseActivity;Landroid/content/Context;Lcom/shopkick/app/controllers/IPanelControllerCallback;Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;)V

    goto :goto_2

    .line 195
    :pswitch_2
    new-instance v2, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;

    iget-object v6, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v7, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 196
    invoke-virtual {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v9

    invoke-virtual {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->getContext()Landroid/content/Context;

    move-result-object v10

    move-object v5, v2

    move-object v11, p0

    move-object v12, p0

    invoke-direct/range {v5 .. v12}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/logging/UserEventLogger;Ljava/util/Map;Lcom/shopkick/app/activities/BaseActivity;Landroid/content/Context;Lcom/shopkick/app/controllers/IPanelControllerCallback;Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;)V

    goto :goto_2

    .line 199
    :cond_1
    new-instance v2, Lcom/shopkick/app/controllers/FirstNamePanelController;

    iget-object v6, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v7, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 200
    invoke-virtual {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v9

    invoke-virtual {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->getContext()Landroid/content/Context;

    move-result-object v10

    move-object v5, v2

    move-object v11, p0

    move-object v12, p0

    invoke-direct/range {v5 .. v12}, Lcom/shopkick/app/controllers/FirstNamePanelController;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/logging/UserEventLogger;Ljava/util/Map;Lcom/shopkick/app/activities/BaseActivity;Landroid/content/Context;Lcom/shopkick/app/controllers/IPanelControllerCallback;Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;)V

    :goto_2
    if-eqz v2, :cond_2

    const/4 v5, 0x1

    goto :goto_3

    :cond_2
    move v5, p1

    :goto_3
    const-string v6, "panelController should not be null"

    .line 215
    invoke-static {v5, v6}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    if-eqz v2, :cond_3

    .line 218
    new-instance v5, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;

    invoke-direct {v5, v3, v4, v2}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;-><init>(ILjava/lang/String;Lcom/shopkick/app/controllers/BasePanelController;)V

    .line 219
    iget-object v2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelInfoList:Ljava/util/ArrayList;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_4
    return-void

    :catch_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private expandImage()V
    .locals 3

    .line 248
    new-instance v0, Landroid/support/constraint/ConstraintSet;

    invoke-direct {v0}, Landroid/support/constraint/ConstraintSet;-><init>()V

    .line 249
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x43080000    # 136.0f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    .line 250
    iget-object v2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->topLayout:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v2}, Landroid/support/constraint/ConstraintSet;->clone(Landroid/support/constraint/ConstraintLayout;)V

    const v2, 0x7f09045d

    .line 251
    invoke-virtual {v0, v2, v1}, Landroid/support/constraint/ConstraintSet;->constrainHeight(II)V

    .line 252
    invoke-virtual {v0, v2, v1}, Landroid/support/constraint/ConstraintSet;->constrainWidth(II)V

    .line 253
    iget-object v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->topLayout:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintSet;->applyTo(Landroid/support/constraint/ConstraintLayout;)V

    .line 255
    new-instance v0, Landroid/transition/Scene;

    iget-object v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->constraintLayout:Landroid/support/constraint/ConstraintLayout;

    invoke-direct {v0, v1}, Landroid/transition/Scene;-><init>(Landroid/view/ViewGroup;)V

    .line 257
    new-instance v1, Landroid/transition/AutoTransition;

    invoke-direct {v1}, Landroid/transition/AutoTransition;-><init>()V

    .line 258
    invoke-static {v0, v1}, Landroid/transition/TransitionManager;->go(Landroid/transition/Scene;Landroid/transition/Transition;)V

    return-void
.end method

.method private fadeSubtitle(I)V
    .locals 3

    .line 274
    invoke-virtual {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f010021

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 275
    new-instance v1, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$1;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$1;-><init>(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;I)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    const-wide/16 v1, 0x12c

    .line 294
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 295
    iget-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->subtitleTextView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private lockTopLayoutSize(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 263
    iget-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->topLayout:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {p1}, Landroid/support/constraint/ConstraintLayout;->getHeight()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->topLayoutHeight:I

    .line 265
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->topLayout:Landroid/support/constraint/ConstraintLayout;

    iget v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->topLayoutHeight:I

    invoke-virtual {p1, v0}, Landroid/support/constraint/ConstraintLayout;->setMinHeight(I)V

    return-void
.end method

.method private shrinkImage()V
    .locals 3

    .line 232
    new-instance v0, Landroid/support/constraint/ConstraintSet;

    invoke-direct {v0}, Landroid/support/constraint/ConstraintSet;-><init>()V

    .line 233
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x42b40000    # 90.0f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    .line 234
    iget-object v2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->topLayout:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v2}, Landroid/support/constraint/ConstraintSet;->clone(Landroid/support/constraint/ConstraintLayout;)V

    const v2, 0x7f09045d

    .line 235
    invoke-virtual {v0, v2, v1}, Landroid/support/constraint/ConstraintSet;->constrainHeight(II)V

    .line 236
    invoke-virtual {v0, v2, v1}, Landroid/support/constraint/ConstraintSet;->constrainWidth(II)V

    .line 237
    iget-object v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->topLayout:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintSet;->applyTo(Landroid/support/constraint/ConstraintLayout;)V

    .line 239
    new-instance v0, Landroid/transition/Scene;

    iget-object v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->constraintLayout:Landroid/support/constraint/ConstraintLayout;

    invoke-direct {v0, v1}, Landroid/transition/Scene;-><init>(Landroid/view/ViewGroup;)V

    .line 241
    new-instance v1, Landroid/transition/AutoTransition;

    invoke-direct {v1}, Landroid/transition/AutoTransition;-><init>()V

    .line 243
    invoke-static {v0, v1}, Landroid/transition/TransitionManager;->go(Landroid/transition/Scene;Landroid/transition/Transition;)V

    return-void
.end method

.method private slidePanelInLeft()V
    .locals 3

    .line 388
    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelInfoList:Ljava/util/ArrayList;

    iget v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->currentPanelIndex:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;

    .line 389
    invoke-static {v0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;->access$000(Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;)Lcom/shopkick/app/controllers/BasePanelController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/controllers/BasePanelController;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    .line 392
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 393
    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->bottomLayout:Landroid/support/constraint/ConstraintLayout;

    iget v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->currentPanelIndex:I

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintLayout;->removeViewAt(I)V

    .line 396
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelInfoList:Ljava/util/ArrayList;

    iget v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->currentPanelIndex:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;

    .line 397
    invoke-static {v0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;->access$000(Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;)Lcom/shopkick/app/controllers/BasePanelController;

    move-result-object v0

    .line 398
    invoke-virtual {v0}, Lcom/shopkick/app/controllers/BasePanelController;->getView()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    .line 400
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 402
    :cond_1
    invoke-virtual {v0}, Lcom/shopkick/app/controllers/BasePanelController;->onPanelDidShow()V

    .line 404
    invoke-virtual {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f010028

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 405
    new-instance v1, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$5;

    invoke-direct {v1, p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$5;-><init>(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 424
    iget-object v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->bottomLayout:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v1, v0}, Landroid/support/constraint/ConstraintLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private slidePanelInRight()V
    .locals 3

    .line 326
    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelInfoList:Ljava/util/ArrayList;

    iget v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->currentPanelIndex:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;

    .line 327
    invoke-static {v0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;->access$000(Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;)Lcom/shopkick/app/controllers/BasePanelController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/controllers/BasePanelController;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    .line 329
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 332
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelInfoList:Ljava/util/ArrayList;

    iget v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->currentPanelIndex:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;

    .line 333
    invoke-static {v0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;->access$000(Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;)Lcom/shopkick/app/controllers/BasePanelController;

    move-result-object v0

    .line 334
    invoke-virtual {v0}, Lcom/shopkick/app/controllers/BasePanelController;->getView()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    .line 336
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 338
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->bottomLayout:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/controllers/BasePanelController;->setUpPanel(Landroid/view/ViewGroup;)V

    .line 340
    invoke-virtual {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f010029

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 341
    new-instance v1, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$3;

    invoke-direct {v1, p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$3;-><init>(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 358
    iget-object v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->bottomLayout:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v1, v0}, Landroid/support/constraint/ConstraintLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private slidePanelOutLeft()V
    .locals 2

    .line 300
    invoke-virtual {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f01002c

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 302
    new-instance v1, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$2;-><init>(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 322
    iget-object v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->bottomLayout:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v1, v0}, Landroid/support/constraint/ConstraintLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private slidePanelOutRight()V
    .locals 2

    .line 363
    invoke-virtual {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f01002d

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 365
    new-instance v1, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$4;

    invoke-direct {v1, p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$4;-><init>(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 384
    iget-object v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->bottomLayout:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v1, v0}, Landroid/support/constraint/ConstraintLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private triggerPreviousPanel()Z
    .locals 4

    .line 430
    iget-boolean v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelIsTransitioning:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 434
    :cond_0
    iget v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->currentPanelIndex:I

    if-nez v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x1

    .line 438
    iput-boolean v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelIsTransitioning:Z

    .line 440
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0x13d

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x19

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 441
    iget-object v2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelInfoList:Ljava/util/ArrayList;

    iget v3, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->currentPanelIndex:I

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;

    invoke-static {v2}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;->access$1100(Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setPanel(Ljava/lang/Integer;)V

    .line 442
    iget-object v2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v2, v1}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 445
    iget v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->currentPanelIndex:I

    sub-int/2addr v1, v0

    invoke-direct {p0, v1}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->fadeSubtitle(I)V

    .line 449
    invoke-direct {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->slidePanelOutRight()V

    .line 451
    iget v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->currentPanelIndex:I

    if-ne v1, v0, :cond_2

    .line 452
    iget-object v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->backArrow:Landroid/widget/ImageView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_2
    return v0
.end method

.method private unlockTopLayoutSize()V
    .locals 2

    .line 269
    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->topLayout:Landroid/support/constraint/ConstraintLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintLayout;->setMinHeight(I)V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const/4 p3, 0x0

    const v0, 0x7f0c01d9

    .line 112
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090731

    .line 115
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/support/constraint/ConstraintLayout;

    iput-object p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->constraintLayout:Landroid/support/constraint/ConstraintLayout;

    .line 118
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->constraintLayout:Landroid/support/constraint/ConstraintLayout;

    const v0, 0x7f090054

    invoke-virtual {p2, v0}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->backArrow:Landroid/widget/ImageView;

    .line 119
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->backArrow:Landroid/widget/ImageView;

    invoke-virtual {p2, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f09079b

    .line 122
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/support/constraint/ConstraintLayout;

    iput-object p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->topLayout:Landroid/support/constraint/ConstraintLayout;

    .line 123
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->topLayout:Landroid/support/constraint/ConstraintLayout;

    const v0, 0x7f09045d

    invoke-virtual {p2, v0}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->mainImageView:Landroid/widget/ImageView;

    const p2, 0x7f090306

    .line 124
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ProgressBar;

    iput-object p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->progressBar:Landroid/widget/ProgressBar;

    .line 125
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->topLayout:Landroid/support/constraint/ConstraintLayout;

    const v0, 0x7f090461

    invoke-virtual {p2, v0}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKTextView;

    iput-object p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->mainTextView:Lcom/shopkick/app/widget/SKTextView;

    .line 126
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->topLayout:Landroid/support/constraint/ConstraintLayout;

    const v0, 0x7f090709

    invoke-virtual {p2, v0}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKTextView;

    iput-object p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->subtitleTextView:Lcom/shopkick/app/widget/SKTextView;

    .line 129
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->constraintLayout:Landroid/support/constraint/ConstraintLayout;

    const v0, 0x7f0904a4

    invoke-virtual {p2, v0}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/support/constraint/ConstraintLayout;

    iput-object p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->bottomLayout:Landroid/support/constraint/ConstraintLayout;

    .line 130
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->bottomLayout:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {p2, p0}, Landroid/support/constraint/ConstraintLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 133
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->mainText:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    const/16 v0, 0x32

    if-le p2, v0, :cond_0

    .line 134
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->mainTextView:Lcom/shopkick/app/widget/SKTextView;

    const/high16 v0, 0x41900000    # 18.0f

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKTextView;->setTextSize(F)V

    .line 136
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->mainTextView:Lcom/shopkick/app/widget/SKTextView;

    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->mainText:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 140
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v0, 0x77a12

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 141
    iget-object v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->screenName:Ljava/lang/String;

    invoke-virtual {p2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScreenName(Ljava/lang/String;)V

    .line 142
    iget-object v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->flowId:Ljava/lang/String;

    invoke-virtual {p2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    .line 143
    invoke-static {p2}, Lcom/shopkick/app/application/SIP;->setupClientLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 144
    invoke-static {v0}, Lcom/shopkick/app/application/SIP;->onUserAction(I)V

    .line 145
    invoke-virtual {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->fetchImage()V

    .line 148
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->params:Ljava/util/Map;

    const-string v0, "screen_panels"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p2}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 149
    invoke-direct {p0, p2}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->constructPanelInfoList(Ljava/lang/String;)V

    .line 152
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelInfoList:Ljava/util/ArrayList;

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;

    .line 153
    invoke-static {p2}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;->access$000(Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;)Lcom/shopkick/app/controllers/BasePanelController;

    move-result-object p2

    .line 154
    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->bottomLayout:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/controllers/BasePanelController;->setUpPanel(Landroid/view/ViewGroup;)V

    .line 155
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->subtitleTextView:Lcom/shopkick/app/widget/SKTextView;

    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelInfoList:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;

    invoke-static {p3}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;->access$100(Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    return-object p1
.end method

.method public getValueForKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 492
    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelDataStorageMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 81
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/TemplateScreen;->init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V

    const-string p1, "button_url"

    .line 84
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->nextUrl:Ljava/lang/String;

    .line 86
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelDataStorageMap:Ljava/util/Map;

    return-void
.end method

.method public onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    .locals 1

    .line 98
    invoke-direct {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->triggerPreviousPanel()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->DONT_GO_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0

    .line 101
    :cond_0
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->PERFORM_ACTIVITY_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    const v0, 0x77a12

    .line 162
    invoke-static {v0}, Lcom/shopkick/app/application/SIP;->onCancelEvent(I)V

    .line 163
    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->backArrow:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_0

    .line 164
    invoke-direct {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->triggerPreviousPanel()Z

    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 522
    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelInfoList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;

    .line 523
    invoke-static {v1}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;->access$000(Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;)Lcom/shopkick/app/controllers/BasePanelController;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/controllers/BasePanelController;->destroy()V

    goto :goto_0

    .line 525
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/TemplateScreen;->onDestroy()V

    return-void
.end method

.method public onResume()V
    .locals 2

    .line 70
    invoke-super {p0}, Lcom/shopkick/app/TemplateScreen;->onResume()V

    .line 73
    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelInfoList:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 74
    iget v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->currentPanelIndex:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;

    invoke-static {v0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;->access$000(Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;)Lcom/shopkick/app/controllers/BasePanelController;

    move-result-object v0

    .line 75
    invoke-virtual {v0}, Lcom/shopkick/app/controllers/BasePanelController;->handleOnResume()V

    :cond_0
    return-void
.end method

.method public putValueForKey(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 498
    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelDataStorageMap:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public removeValueForKey(Ljava/lang/String;)V
    .locals 1

    .line 503
    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelDataStorageMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public shouldDisplayAppScreenHeader()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public shouldHideBack()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public triggerFlowFinished()V
    .locals 2

    const/4 v0, 0x1

    .line 485
    iput-boolean v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelIsTransitioning:Z

    .line 486
    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v0

    .line 487
    iget-object v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->nextUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method

.method public triggerNextPanel()V
    .locals 3

    .line 459
    iget-boolean v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelIsTransitioning:Z

    if-eqz v0, :cond_0

    return-void

    .line 463
    :cond_0
    iget v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->currentPanelIndex:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelInfoList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ne v0, v2, :cond_1

    .line 464
    invoke-virtual {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->triggerFlowFinished()V

    return-void

    .line 468
    :cond_1
    iput-boolean v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->panelIsTransitioning:Z

    .line 471
    iget v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->currentPanelIndex:I

    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->fadeSubtitle(I)V

    .line 473
    iget v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->currentPanelIndex:I

    if-nez v0, :cond_2

    .line 474
    invoke-direct {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->shrinkImage()V

    .line 475
    invoke-direct {p0, v1}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->lockTopLayoutSize(Z)V

    .line 476
    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->backArrow:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 480
    :cond_2
    invoke-direct {p0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->slidePanelOutLeft()V

    return-void
.end method
