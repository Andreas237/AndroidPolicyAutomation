.class public Lorg/jivesoftware/smack/SmackException$FeatureNotSupportedException;
.super Lorg/jivesoftware/smack/SmackException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/SmackException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FeatureNotSupportedException"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x416960b1fedf2ef0L


# instance fields
.field private final feature:Ljava/lang/String;

.field private final jid:Lo/fte;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 251
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/jivesoftware/smack/SmackException$FeatureNotSupportedException;-><init>(Ljava/lang/String;Lo/fte;)V

    .line 252
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lo/fte;)V
    .locals 3

    .line 255
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " not supported"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    if-nez p2, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " by \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/jivesoftware/smack/SmackException;-><init>(Ljava/lang/String;)V

    .line 256
    iput-object p2, p0, Lorg/jivesoftware/smack/SmackException$FeatureNotSupportedException;->jid:Lo/fte;

    .line 257
    iput-object p1, p0, Lorg/jivesoftware/smack/SmackException$FeatureNotSupportedException;->feature:Ljava/lang/String;

    .line 258
    return-void
.end method


# virtual methods
.method public getFeature()Ljava/lang/String;
    .locals 1

    .line 266
    iget-object v0, p0, Lorg/jivesoftware/smack/SmackException$FeatureNotSupportedException;->feature:Ljava/lang/String;

    return-object v0
.end method

.method public getJid()Lo/fte;
    .locals 1

    .line 276
    iget-object v0, p0, Lorg/jivesoftware/smack/SmackException$FeatureNotSupportedException;->jid:Lo/fte;

    return-object v0
.end method
