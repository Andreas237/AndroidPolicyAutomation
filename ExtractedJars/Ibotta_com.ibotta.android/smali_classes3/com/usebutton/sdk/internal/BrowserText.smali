.class public Lcom/usebutton/sdk/internal/BrowserText;
.super Ljava/lang/Object;
.source "BrowserText.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/BrowserText$TextChangeListener;
    }
.end annotation


# static fields
.field public static final DEFAULT_COLOR:I = -0x1

.field public static final DEFAULT_COPY:Ljava/lang/String; = ""


# instance fields
.field private mColor:I

.field private mCopy:Ljava/lang/String;

.field private final mListener:Lcom/usebutton/sdk/internal/BrowserText$TextChangeListener;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/BrowserText$TextChangeListener;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 30
    iput v0, p0, Lcom/usebutton/sdk/internal/BrowserText;->mColor:I

    const-string v0, ""

    .line 31
    iput-object v0, p0, Lcom/usebutton/sdk/internal/BrowserText;->mCopy:Ljava/lang/String;

    .line 32
    iput-object p1, p0, Lcom/usebutton/sdk/internal/BrowserText;->mListener:Lcom/usebutton/sdk/internal/BrowserText$TextChangeListener;

    return-void
.end method


# virtual methods
.method public getColor()I
    .locals 1

    .line 50
    iget v0, p0, Lcom/usebutton/sdk/internal/BrowserText;->mColor:I

    return v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserText;->mCopy:Ljava/lang/String;

    return-object v0
.end method

.method public setColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorInt;
        .end annotation
    .end param

    .line 69
    iput p1, p0, Lcom/usebutton/sdk/internal/BrowserText;->mColor:I

    .line 70
    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserText;->mListener:Lcom/usebutton/sdk/internal/BrowserText$TextChangeListener;

    invoke-interface {v0, p1}, Lcom/usebutton/sdk/internal/BrowserText$TextChangeListener;->onColorChange(I)V

    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 1

    .line 59
    iput-object p1, p0, Lcom/usebutton/sdk/internal/BrowserText;->mCopy:Ljava/lang/String;

    .line 60
    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserText;->mListener:Lcom/usebutton/sdk/internal/BrowserText$TextChangeListener;

    invoke-interface {v0, p1}, Lcom/usebutton/sdk/internal/BrowserText$TextChangeListener;->onTextChange(Ljava/lang/String;)V

    return-void
.end method
