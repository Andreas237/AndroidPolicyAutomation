.class public Lorg/webrtc/PeerConnectionFactory$InitializationOptions;
.super Ljava/lang/Object;
.source "PeerConnectionFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/PeerConnectionFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "InitializationOptions"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/webrtc/PeerConnectionFactory$InitializationOptions$Builder;
    }
.end annotation


# instance fields
.field final applicationContext:Landroid/content/Context;

.field final enableInternalTracer:Z

.field final fieldTrials:Ljava/lang/String;

.field loggable:Lorg/webrtc/Loggable;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field loggableSeverity:Lorg/webrtc/Logging$Severity;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final nativeLibraryLoader:Lorg/webrtc/NativeLibraryLoader;

.field final nativeLibraryName:Ljava/lang/String;


# direct methods
.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;ZLorg/webrtc/NativeLibraryLoader;Ljava/lang/String;Lorg/webrtc/Loggable;Lorg/webrtc/Logging$Severity;)V
    .locals 0
    .param p6    # Lorg/webrtc/Loggable;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Lorg/webrtc/Logging$Severity;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lorg/webrtc/PeerConnectionFactory$InitializationOptions;->applicationContext:Landroid/content/Context;

    .line 51
    iput-object p2, p0, Lorg/webrtc/PeerConnectionFactory$InitializationOptions;->fieldTrials:Ljava/lang/String;

    .line 52
    iput-boolean p3, p0, Lorg/webrtc/PeerConnectionFactory$InitializationOptions;->enableInternalTracer:Z

    .line 53
    iput-object p4, p0, Lorg/webrtc/PeerConnectionFactory$InitializationOptions;->nativeLibraryLoader:Lorg/webrtc/NativeLibraryLoader;

    .line 54
    iput-object p5, p0, Lorg/webrtc/PeerConnectionFactory$InitializationOptions;->nativeLibraryName:Ljava/lang/String;

    .line 55
    iput-object p6, p0, Lorg/webrtc/PeerConnectionFactory$InitializationOptions;->loggable:Lorg/webrtc/Loggable;

    .line 56
    iput-object p7, p0, Lorg/webrtc/PeerConnectionFactory$InitializationOptions;->loggableSeverity:Lorg/webrtc/Logging$Severity;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;ZLorg/webrtc/NativeLibraryLoader;Ljava/lang/String;Lorg/webrtc/Loggable;Lorg/webrtc/Logging$Severity;Lorg/webrtc/PeerConnectionFactory$1;)V
    .locals 0

    .line 37
    invoke-direct/range {p0 .. p7}, Lorg/webrtc/PeerConnectionFactory$InitializationOptions;-><init>(Landroid/content/Context;Ljava/lang/String;ZLorg/webrtc/NativeLibraryLoader;Ljava/lang/String;Lorg/webrtc/Loggable;Lorg/webrtc/Logging$Severity;)V

    return-void
.end method

.method public static builder(Landroid/content/Context;)Lorg/webrtc/PeerConnectionFactory$InitializationOptions$Builder;
    .locals 1

    .line 60
    new-instance v0, Lorg/webrtc/PeerConnectionFactory$InitializationOptions$Builder;

    invoke-direct {v0, p0}, Lorg/webrtc/PeerConnectionFactory$InitializationOptions$Builder;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
