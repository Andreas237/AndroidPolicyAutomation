.class public Lcom/jawbone/upplatformsdk/datamodel/Data;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public xid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getXid()Ljava/lang/String;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/jawbone/upplatformsdk/datamodel/Data;->xid:Ljava/lang/String;

    return-object v0
.end method

.method public setXid(Ljava/lang/String;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/jawbone/upplatformsdk/datamodel/Data;->xid:Ljava/lang/String;

    .line 18
    return-void
.end method
