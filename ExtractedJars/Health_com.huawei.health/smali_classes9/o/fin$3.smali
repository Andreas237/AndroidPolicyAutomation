.class Lo/fin$3;
.super Landroid/support/v7/widget/GridLayoutManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fin;->c(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/fin;


# direct methods
.method constructor <init>(Lo/fin;Landroid/content/Context;I)V
    .locals 0

    .line 157
    iput-object p1, p0, Lo/fin$3;->e:Lo/fin;

    invoke-direct {p0, p2, p3}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public canScrollHorizontally()Z
    .locals 1

    .line 165
    const/4 v0, 0x0

    return v0
.end method

.method public canScrollVertically()Z
    .locals 1

    .line 160
    const/4 v0, 0x0

    return v0
.end method
