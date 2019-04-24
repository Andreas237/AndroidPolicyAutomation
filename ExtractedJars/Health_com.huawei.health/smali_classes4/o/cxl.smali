.class public Lo/cxl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/bluetooth/BluetoothAdapter$LeScanCallback;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x12
.end annotation


# instance fields
.field private b:Lo/cya;


# direct methods
.method public constructor <init>(Lo/cya;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cxl;->b:Lo/cya;

    .line 18
    iput-object p1, p0, Lo/cxl;->b:Lo/cya;

    .line 19
    return-void
.end method


# virtual methods
.method public onLeScan(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 2

    .line 23
    iget-object v0, p0, Lo/cxl;->b:Lo/cya;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 24
    iget-object v0, p0, Lo/cxl;->b:Lo/cya;

    invoke-interface {v0, p1, p2, p3}, Lo/cya;->a(Landroid/bluetooth/BluetoothDevice;I[B)V

    .line 26
    :cond_0
    return-void
.end method
