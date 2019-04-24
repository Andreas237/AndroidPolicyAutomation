.class public Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;
.super Ljava/lang/Object;
.source "AnimatedDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AnimatedDialogDisplayValues"
.end annotation


# instance fields
.field animationName:Ljava/lang/String;

.field buttonText:Ljava/lang/String;

.field message:Ljava/lang/String;

.field title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAnimationName()Ljava/lang/String;
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;->animationName:Ljava/lang/String;

    return-object v0
.end method

.method public getButtonText()Ljava/lang/String;
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;->buttonText:Ljava/lang/String;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;->message:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setAnimationName(Ljava/lang/String;)V
    .locals 0

    .line 157
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;->animationName:Ljava/lang/String;

    return-void
.end method

.method public setButtonText(Ljava/lang/String;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;->buttonText:Ljava/lang/String;

    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;->message:Ljava/lang/String;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;->title:Ljava/lang/String;

    return-void
.end method
