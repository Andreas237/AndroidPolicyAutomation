.class public final synthetic Lcom/ibotta/android/buttonsdk/-$$Lambda$p0bEpbPKdTIYcusWrRRXaXHAvGA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/usebutton/sdk/purchasepath/BrowserInterface;


# direct methods
.method public synthetic constructor <init>(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/buttonsdk/-$$Lambda$p0bEpbPKdTIYcusWrRRXaXHAvGA;->f$0:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/-$$Lambda$p0bEpbPKdTIYcusWrRRXaXHAvGA;->f$0:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    invoke-interface {v0}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->hideTopCard()V

    return-void
.end method
