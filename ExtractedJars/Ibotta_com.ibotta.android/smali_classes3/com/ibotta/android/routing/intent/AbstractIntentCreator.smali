.class public abstract Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.super Ljava/lang/Object;
.source "AbstractIntentCreator.java"

# interfaces
.implements Lcom/ibotta/android/routing/intent/IntentCreator;


# instance fields
.field protected final context:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method protected addClearFlags(Landroid/content/Intent;)V
    .locals 1

    const v0, 0x8000

    .line 18
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 v0, 0x10000000

    .line 19
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 v0, 0x20000

    .line 20
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    return-void
.end method
