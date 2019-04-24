.class public Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "ServiceAuthDialog"


# direct methods
.method private constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 33
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 34
    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog;->setOwnerActivity(Landroid/app/Activity;)V

    .line 35
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;ILcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$1;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method
