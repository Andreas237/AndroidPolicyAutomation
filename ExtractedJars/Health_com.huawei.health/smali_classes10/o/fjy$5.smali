.class final Lo/fjy$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ebo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fjy;->a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;ZLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lo/fjy$5;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getIBaseResponseCallback()Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 148
    iget-object v0, p0, Lo/fjy$5;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method
