.class public Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;
.super Ljava/lang/Object;
.source "TemplateMultiPanelScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/launch/TemplateMultiPanelScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PanelInfo"
.end annotation


# instance fields
.field private controllerInstance:Lcom/shopkick/app/controllers/BasePanelController;

.field private panelType:I

.field private subtitleText:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Lcom/shopkick/app/controllers/BasePanelController;)V
    .locals 0

    .line 512
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 514
    iput p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;->panelType:I

    .line 515
    iput-object p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;->subtitleText:Ljava/lang/String;

    .line 516
    iput-object p3, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;->controllerInstance:Lcom/shopkick/app/controllers/BasePanelController;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;)Lcom/shopkick/app/controllers/BasePanelController;
    .locals 0

    .line 507
    iget-object p0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;->controllerInstance:Lcom/shopkick/app/controllers/BasePanelController;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;)Ljava/lang/String;
    .locals 0

    .line 507
    iget-object p0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;->subtitleText:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;)I
    .locals 0

    .line 507
    iget p0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;->panelType:I

    return p0
.end method
