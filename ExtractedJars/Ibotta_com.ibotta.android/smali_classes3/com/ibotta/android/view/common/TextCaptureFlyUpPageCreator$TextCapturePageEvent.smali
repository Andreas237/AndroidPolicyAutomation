.class public Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCapturePageEvent;
.super Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;
.source "TextCaptureFlyUpPageCreator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TextCapturePageEvent"
.end annotation


# instance fields
.field private input:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 126
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;-><init>()V

    return-void
.end method


# virtual methods
.method public getInput()Ljava/lang/String;
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCapturePageEvent;->input:Ljava/lang/String;

    return-object v0
.end method

.method public setInput(Ljava/lang/String;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCapturePageEvent;->input:Ljava/lang/String;

    return-void
.end method
