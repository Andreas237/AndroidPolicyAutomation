.class public Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$ButtonHandler;,
        Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;,
        Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;
    }
.end annotation


# static fields
.field static final b:Ljava/lang/String;


# instance fields
.field private d:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    const-class v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 32
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$style;->common_ui_CustomDialog:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;-><init>(Landroid/content/Context;I)V

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 39
    return-void
.end method


# virtual methods
.method public c(Landroid/view/View;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;->d:Landroid/view/View;

    .line 47
    return-void
.end method
