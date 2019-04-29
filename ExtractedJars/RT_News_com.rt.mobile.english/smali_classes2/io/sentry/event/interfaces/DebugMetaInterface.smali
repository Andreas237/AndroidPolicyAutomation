.class public Lio/sentry/event/interfaces/DebugMetaInterface;
.super Ljava/lang/Object;
.source "DebugMetaInterface.java"

# interfaces
.implements Lio/sentry/event/interfaces/SentryInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/event/interfaces/DebugMetaInterface$DebugImage;
    }
.end annotation


# static fields
.field public static final DEBUG_META_INTERFACE:Ljava/lang/String; = "debug_meta"


# instance fields
.field private debugImages:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lio/sentry/event/interfaces/DebugMetaInterface$DebugImage;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/event/interfaces/DebugMetaInterface;->debugImages:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public addDebugImage(Lio/sentry/event/interfaces/DebugMetaInterface$DebugImage;)V
    .locals 1

    .line 26
    iget-object v0, p0, Lio/sentry/event/interfaces/DebugMetaInterface;->debugImages:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public getDebugImages()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lio/sentry/event/interfaces/DebugMetaInterface$DebugImage;",
            ">;"
        }
    .end annotation

    .line 17
    iget-object v0, p0, Lio/sentry/event/interfaces/DebugMetaInterface;->debugImages:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getInterfaceName()Ljava/lang/String;
    .locals 1

    const-string v0, "debug_meta"

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 36
    iget-object v0, p0, Lio/sentry/event/interfaces/DebugMetaInterface;->debugImages:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DebugMetaInterface{debugImages="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/event/interfaces/DebugMetaInterface;->debugImages:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
