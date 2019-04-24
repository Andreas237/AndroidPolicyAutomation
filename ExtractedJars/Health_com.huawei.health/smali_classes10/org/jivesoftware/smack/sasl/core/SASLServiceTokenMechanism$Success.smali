.class public Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$Success;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Success"
.end annotation


# instance fields
.field private jid:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 157
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 158
    iput-object p1, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$Success;->jid:Ljava/lang/String;

    .line 159
    return-void
.end method


# virtual methods
.method public getJid()Ljava/lang/String;
    .locals 1

    .line 163
    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$Success;->jid:Ljava/lang/String;

    return-object v0
.end method

.method public toXML()Ljava/lang/String;
    .locals 1

    .line 168
    const/4 v0, 0x0

    return-object v0
.end method
