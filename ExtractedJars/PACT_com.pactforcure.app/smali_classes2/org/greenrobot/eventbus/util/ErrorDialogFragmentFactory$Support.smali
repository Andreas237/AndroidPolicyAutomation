.class public Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory$Support;
.super Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;
.source "ErrorDialogFragmentFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Support"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory",
        "<",
        "Landroid/support/v4/app/Fragment;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lorg/greenrobot/eventbus/util/ErrorDialogConfig;)V
    .locals 0
    .param p1, "config"    # Lorg/greenrobot/eventbus/util/ErrorDialogConfig;

    .prologue
    .line 89
    invoke-direct {p0, p1}, Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;-><init>(Lorg/greenrobot/eventbus/util/ErrorDialogConfig;)V

    .line 90
    return-void
.end method


# virtual methods
.method protected createErrorFragment(Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;Landroid/os/Bundle;)Landroid/support/v4/app/Fragment;
    .locals 1
    .param p1, "event"    # Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;
    .param p2, "arguments"    # Landroid/os/Bundle;

    .prologue
    .line 93
    new-instance v0, Lorg/greenrobot/eventbus/util/ErrorDialogFragments$Support;

    invoke-direct {v0}, Lorg/greenrobot/eventbus/util/ErrorDialogFragments$Support;-><init>()V

    .line 94
    .local v0, "errorFragment":Lorg/greenrobot/eventbus/util/ErrorDialogFragments$Support;
    invoke-virtual {v0, p2}, Lorg/greenrobot/eventbus/util/ErrorDialogFragments$Support;->setArguments(Landroid/os/Bundle;)V

    .line 95
    return-object v0
.end method

.method protected bridge synthetic createErrorFragment(Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;Landroid/os/Bundle;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 86
    invoke-virtual {p0, p1, p2}, Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory$Support;->createErrorFragment(Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;Landroid/os/Bundle;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    return-object v0
.end method
