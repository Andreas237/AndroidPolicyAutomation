.class public Lorg/jdom2/located/LocatedEntityRef;
.super Lorg/jdom2/EntityRef;
.source "LocatedEntityRef.java"

# interfaces
.implements Lorg/jdom2/located/Located;


# static fields
.field private static final serialVersionUID:J = 0xc8L


# instance fields
.field private col:I

.field private line:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 77
    invoke-direct {p0, p1}, Lorg/jdom2/EntityRef;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1, p2}, Lorg/jdom2/EntityRef;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 109
    invoke-direct {p0, p1, p2, p3}, Lorg/jdom2/EntityRef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getColumn()I
    .locals 1

    .line 126
    iget v0, p0, Lorg/jdom2/located/LocatedEntityRef;->col:I

    return v0
.end method

.method public getLine()I
    .locals 1

    .line 121
    iget v0, p0, Lorg/jdom2/located/LocatedEntityRef;->line:I

    return v0
.end method

.method public setColumn(I)V
    .locals 0

    .line 136
    iput p1, p0, Lorg/jdom2/located/LocatedEntityRef;->col:I

    return-void
.end method

.method public setLine(I)V
    .locals 0

    .line 131
    iput p1, p0, Lorg/jdom2/located/LocatedEntityRef;->line:I

    return-void
.end method
