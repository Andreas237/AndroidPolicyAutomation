.class public interface abstract Lcom/squareup/haha/perflib/io/HprofBuffer;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final HPROF_BYTE_ORDER:Ljava/nio/ByteOrder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    sput-object v0, Lcom/squareup/haha/perflib/io/HprofBuffer;->HPROF_BYTE_ORDER:Ljava/nio/ByteOrder;

    return-void
.end method


# virtual methods
.method public abstract hasRemaining()Z
.end method

.method public abstract position()J
.end method

.method public abstract read([B)V
.end method

.method public abstract readByte()B
.end method

.method public abstract readChar()C
.end method

.method public abstract readDouble()D
.end method

.method public abstract readFloat()F
.end method

.method public abstract readInt()I
.end method

.method public abstract readLong()J
.end method

.method public abstract readShort()S
.end method

.method public abstract readSubSequence([BII)V
.end method

.method public abstract remaining()J
.end method

.method public abstract setPosition(J)V
.end method
