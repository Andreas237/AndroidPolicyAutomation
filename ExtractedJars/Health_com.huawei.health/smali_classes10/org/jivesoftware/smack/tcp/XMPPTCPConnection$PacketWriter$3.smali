.class Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;


# direct methods
.method constructor <init>(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;)V
    .locals 0

    .line 606
    iput-object p1, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter$3;->b:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 609
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter$3;->b:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->access$1500(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;)V

    .line 610
    return-void
.end method
