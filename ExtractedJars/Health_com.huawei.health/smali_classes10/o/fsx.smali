.class public abstract Lo/fsx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private element:Ljava/lang/String;

.field private ns:Ljava/lang/String;

.field private provider:Ljava/lang/Object;


# direct methods
.method protected constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lo/fsx;->element:Ljava/lang/String;

    .line 26
    iput-object p2, p0, Lo/fsx;->ns:Ljava/lang/String;

    .line 27
    iput-object p3, p0, Lo/fsx;->provider:Ljava/lang/Object;

    .line 28
    return-void
.end method


# virtual methods
.method public getElementName()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/fsx;->element:Ljava/lang/String;

    return-object v0
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/fsx;->ns:Ljava/lang/String;

    return-object v0
.end method

.method public getProvider()Ljava/lang/Object;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/fsx;->provider:Ljava/lang/Object;

    return-object v0
.end method
