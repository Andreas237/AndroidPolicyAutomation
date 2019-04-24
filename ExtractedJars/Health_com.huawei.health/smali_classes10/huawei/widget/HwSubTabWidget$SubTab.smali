.class public Lhuawei/widget/HwSubTabWidget$SubTab;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhuawei/widget/HwSubTabWidget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "SubTab"
.end annotation


# static fields
.field public static final INVALID_POSITION:I = -0x1


# instance fields
.field private mCallback:Lhuawei/widget/HwSubTabWidget$SubTabListener;

.field private mPosition:I

.field private mSubTabId:I

.field private mTag:Ljava/lang/Object;

.field private mText:Ljava/lang/CharSequence;

.field final synthetic this$0:Lhuawei/widget/HwSubTabWidget;


# direct methods
.method public constructor <init>(Lhuawei/widget/HwSubTabWidget;)V
    .locals 3

    .line 316
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v1, v2}, Lhuawei/widget/HwSubTabWidget$SubTab;-><init>(Lhuawei/widget/HwSubTabWidget;Ljava/lang/CharSequence;Lhuawei/widget/HwSubTabWidget$SubTabListener;Ljava/lang/Object;)V

    .line 317
    return-void
.end method

.method public constructor <init>(Lhuawei/widget/HwSubTabWidget;Ljava/lang/CharSequence;)V
    .locals 2

    .line 320
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lhuawei/widget/HwSubTabWidget$SubTab;-><init>(Lhuawei/widget/HwSubTabWidget;Ljava/lang/CharSequence;Lhuawei/widget/HwSubTabWidget$SubTabListener;Ljava/lang/Object;)V

    .line 321
    return-void
.end method

.method public constructor <init>(Lhuawei/widget/HwSubTabWidget;Ljava/lang/CharSequence;Lhuawei/widget/HwSubTabWidget$SubTabListener;)V
    .locals 1

    .line 324
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lhuawei/widget/HwSubTabWidget$SubTab;-><init>(Lhuawei/widget/HwSubTabWidget;Ljava/lang/CharSequence;Lhuawei/widget/HwSubTabWidget$SubTabListener;Ljava/lang/Object;)V

    .line 325
    return-void
.end method

.method public constructor <init>(Lhuawei/widget/HwSubTabWidget;Ljava/lang/CharSequence;Lhuawei/widget/HwSubTabWidget$SubTabListener;Ljava/lang/Object;)V
    .locals 1

    .line 331
    iput-object p1, p0, Lhuawei/widget/HwSubTabWidget$SubTab;->this$0:Lhuawei/widget/HwSubTabWidget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 310
    const/4 v0, -0x1

    iput v0, p0, Lhuawei/widget/HwSubTabWidget$SubTab;->mPosition:I

    .line 313
    const/4 v0, -0x1

    iput v0, p0, Lhuawei/widget/HwSubTabWidget$SubTab;->mSubTabId:I

    .line 332
    iput-object p2, p0, Lhuawei/widget/HwSubTabWidget$SubTab;->mText:Ljava/lang/CharSequence;

    .line 333
    iput-object p3, p0, Lhuawei/widget/HwSubTabWidget$SubTab;->mCallback:Lhuawei/widget/HwSubTabWidget$SubTabListener;

    .line 334
    iput-object p4, p0, Lhuawei/widget/HwSubTabWidget$SubTab;->mTag:Ljava/lang/Object;

    .line 335
    return-void
.end method

.method public constructor <init>(Lhuawei/widget/HwSubTabWidget;Ljava/lang/CharSequence;Ljava/lang/Object;)V
    .locals 1

    .line 328
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Lhuawei/widget/HwSubTabWidget$SubTab;-><init>(Lhuawei/widget/HwSubTabWidget;Ljava/lang/CharSequence;Lhuawei/widget/HwSubTabWidget$SubTabListener;Ljava/lang/Object;)V

    .line 329
    return-void
.end method


# virtual methods
.method public getCallback()Lhuawei/widget/HwSubTabWidget$SubTabListener;
    .locals 1

    .line 338
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget$SubTab;->mCallback:Lhuawei/widget/HwSubTabWidget$SubTabListener;

    return-object v0
.end method

.method public getPosition()I
    .locals 1

    .line 342
    iget v0, p0, Lhuawei/widget/HwSubTabWidget$SubTab;->mPosition:I

    return v0
.end method

.method public getSubTabId()I
    .locals 1

    .line 389
    iget v0, p0, Lhuawei/widget/HwSubTabWidget$SubTab;->mSubTabId:I

    return v0
.end method

.method public getTag()Ljava/lang/Object;
    .locals 1

    .line 380
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget$SubTab;->mTag:Ljava/lang/Object;

    return-object v0
.end method

.method public getText()Ljava/lang/CharSequence;
    .locals 1

    .line 346
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget$SubTab;->mText:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public select()V
    .locals 1

    .line 350
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget$SubTab;->this$0:Lhuawei/widget/HwSubTabWidget;

    invoke-virtual {v0, p0}, Lhuawei/widget/HwSubTabWidget;->selectSubTab(Lhuawei/widget/HwSubTabWidget$SubTab;)V

    .line 351
    return-void
.end method

.method public setPosition(I)V
    .locals 0

    .line 354
    iput p1, p0, Lhuawei/widget/HwSubTabWidget$SubTab;->mPosition:I

    .line 355
    return-void
.end method

.method public setSubTabId(I)V
    .locals 0

    .line 385
    iput p1, p0, Lhuawei/widget/HwSubTabWidget$SubTab;->mSubTabId:I

    .line 386
    return-void
.end method

.method public setSubTabListener(Lhuawei/widget/HwSubTabWidget$SubTabListener;)Lhuawei/widget/HwSubTabWidget$SubTab;
    .locals 0

    .line 358
    iput-object p1, p0, Lhuawei/widget/HwSubTabWidget$SubTab;->mCallback:Lhuawei/widget/HwSubTabWidget$SubTabListener;

    .line 359
    return-object p0
.end method

.method public setTag(Ljava/lang/Object;)Lhuawei/widget/HwSubTabWidget$SubTab;
    .locals 0

    .line 375
    iput-object p1, p0, Lhuawei/widget/HwSubTabWidget$SubTab;->mTag:Ljava/lang/Object;

    .line 376
    return-object p0
.end method

.method public setText(I)Lhuawei/widget/HwSubTabWidget$SubTab;
    .locals 1

    .line 363
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget$SubTab;->this$0:Lhuawei/widget/HwSubTabWidget;

    invoke-virtual {v0}, Lhuawei/widget/HwSubTabWidget;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabWidget$SubTab;->setText(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v0

    return-object v0
.end method

.method public setText(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;
    .locals 2

    .line 367
    iput-object p1, p0, Lhuawei/widget/HwSubTabWidget$SubTab;->mText:Ljava/lang/CharSequence;

    .line 368
    iget v0, p0, Lhuawei/widget/HwSubTabWidget$SubTab;->mPosition:I

    if-ltz v0, :cond_0

    .line 369
    iget-object v0, p0, Lhuawei/widget/HwSubTabWidget$SubTab;->this$0:Lhuawei/widget/HwSubTabWidget;

    iget v1, p0, Lhuawei/widget/HwSubTabWidget$SubTab;->mPosition:I

    invoke-virtual {v0, v1}, Lhuawei/widget/HwSubTabWidget;->updateSubTab(I)V

    .line 371
    :cond_0
    return-object p0
.end method
