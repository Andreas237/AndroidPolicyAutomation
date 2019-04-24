.class public final Lcom/google/android/gms/measurement/internal/zzfu;
.super Lcom/google/android/gms/measurement/internal/zzfn;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzfo;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/zzfn;-><init>(Lcom/google/android/gms/measurement/internal/zzfo;)V

    return-void
.end method

.method static zza(Lcom/google/android/gms/internal/measurement/zzft;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfu;
    .locals 4

    .line 39
    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzft;->zzaxa:[Lcom/google/android/gms/internal/measurement/zzfu;

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p0, v1

    .line 40
    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzfu;->name:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static zza(Ljava/lang/StringBuilder;I)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    const-string v1, "  "

    .line 327
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final zza(Ljava/lang/StringBuilder;ILcom/google/android/gms/internal/measurement/zzfk;)V
    .locals 6

    if-nez p3, :cond_0

    return-void

    .line 285
    :cond_0
    invoke-static {p1, p2}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    const-string v0, "filter {\n"

    .line 286
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "complement"

    .line 287
    iget-object v1, p3, Lcom/google/android/gms/internal/measurement/zzfk;->zzavs:Ljava/lang/Boolean;

    invoke-static {p1, p2, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "param_name"

    .line 288
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object v1

    iget-object v2, p3, Lcom/google/android/gms/internal/measurement/zzfk;->zzavt:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbu(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, p2, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 v0, p2, 0x1

    const-string/jumbo v1, "string_filter"

    .line 289
    iget-object v2, p3, Lcom/google/android/gms/internal/measurement/zzfk;->zzavq:Lcom/google/android/gms/internal/measurement/zzfn;

    if-eqz v2, :cond_4

    .line 291
    invoke-static {p1, v0}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    .line 292
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " {\n"

    .line 293
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    iget-object v1, v2, Lcom/google/android/gms/internal/measurement/zzfn;->zzawc:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    const-string v1, "UNKNOWN_MATCH_TYPE"

    .line 296
    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzfn;->zzawc:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    packed-switch v3, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-string v1, "IN_LIST"

    goto :goto_0

    :pswitch_1
    const-string v1, "EXACT"

    goto :goto_0

    :pswitch_2
    const-string v1, "PARTIAL"

    goto :goto_0

    :pswitch_3
    const-string v1, "ENDS_WITH"

    goto :goto_0

    :pswitch_4
    const-string v1, "BEGINS_WITH"

    goto :goto_0

    :pswitch_5
    const-string v1, "REGEXP"

    :goto_0
    const-string v3, "match_type"

    .line 308
    invoke-static {p1, v0, v3, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    :cond_1
    const-string v1, "expression"

    .line 309
    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzfn;->zzawd:Ljava/lang/String;

    invoke-static {p1, v0, v1, v3}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v1, "case_sensitive"

    .line 310
    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzfn;->zzawe:Ljava/lang/Boolean;

    invoke-static {p1, v0, v1, v3}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 311
    iget-object v1, v2, Lcom/google/android/gms/internal/measurement/zzfn;->zzawf:[Ljava/lang/String;

    array-length v1, v1

    if-lez v1, :cond_3

    add-int/lit8 v1, v0, 0x1

    .line 312
    invoke-static {p1, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    const-string v1, "expression_list {\n"

    .line 313
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    iget-object v1, v2, Lcom/google/android/gms/internal/measurement/zzfn;->zzawf:[Ljava/lang/String;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    add-int/lit8 v5, v0, 0x2

    .line 315
    invoke-static {p1, v5}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    .line 316
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\n"

    .line 317
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    const-string/jumbo v1, "}\n"

    .line 319
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    :cond_3
    invoke-static {p1, v0}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    const-string/jumbo v1, "}\n"

    .line 321
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    const-string v1, "number_filter"

    .line 322
    iget-object p3, p3, Lcom/google/android/gms/internal/measurement/zzfk;->zzavr:Lcom/google/android/gms/internal/measurement/zzfl;

    invoke-direct {p0, p1, v0, v1, p3}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Lcom/google/android/gms/internal/measurement/zzfl;)V

    .line 323
    invoke-static {p1, p2}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    const-string/jumbo p2, "}\n"

    .line 324
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final zza(Ljava/lang/StringBuilder;ILjava/lang/String;Lcom/google/android/gms/internal/measurement/zzfl;)V
    .locals 1

    if-nez p4, :cond_0

    return-void

    .line 262
    :cond_0
    invoke-static {p1, p2}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    .line 263
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " {\n"

    .line 264
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    iget-object p3, p4, Lcom/google/android/gms/internal/measurement/zzfl;->zzavu:Ljava/lang/Integer;

    if-eqz p3, :cond_1

    const-string p3, "UNKNOWN_COMPARISON_TYPE"

    .line 267
    iget-object v0, p4, Lcom/google/android/gms/internal/measurement/zzfl;->zzavu:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-string p3, "BETWEEN"

    goto :goto_0

    :pswitch_1
    const-string p3, "EQUAL"

    goto :goto_0

    :pswitch_2
    const-string p3, "GREATER_THAN"

    goto :goto_0

    :pswitch_3
    const-string p3, "LESS_THAN"

    :goto_0
    const-string v0, "comparison_type"

    .line 275
    invoke-static {p1, p2, v0, p3}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    :cond_1
    const-string p3, "match_as_float"

    .line 276
    iget-object v0, p4, Lcom/google/android/gms/internal/measurement/zzfl;->zzavv:Ljava/lang/Boolean;

    invoke-static {p1, p2, p3, v0}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string p3, "comparison_value"

    .line 277
    iget-object v0, p4, Lcom/google/android/gms/internal/measurement/zzfl;->zzavw:Ljava/lang/String;

    invoke-static {p1, p2, p3, v0}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string p3, "min_comparison_value"

    .line 278
    iget-object v0, p4, Lcom/google/android/gms/internal/measurement/zzfl;->zzavx:Ljava/lang/String;

    invoke-static {p1, p2, p3, v0}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string p3, "max_comparison_value"

    .line 279
    iget-object p4, p4, Lcom/google/android/gms/internal/measurement/zzfl;->zzavy:Ljava/lang/String;

    invoke-static {p1, p2, p3, p4}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 280
    invoke-static {p1, p2}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    const-string/jumbo p2, "}\n"

    .line 281
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final zza(Ljava/lang/StringBuilder;ILjava/lang/String;Lcom/google/android/gms/internal/measurement/zzfx;Ljava/lang/String;)V
    .locals 9

    if-nez p4, :cond_0

    return-void

    :cond_0
    const/4 p2, 0x3

    .line 206
    invoke-static {p1, p2}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    .line 207
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " {\n"

    .line 208
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    iget-object p3, p4, Lcom/google/android/gms/internal/measurement/zzfx;->zzayo:[J

    const/16 v0, 0xa

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-eqz p3, :cond_3

    .line 210
    invoke-static {p1, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    const-string p3, "results: "

    .line 211
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    iget-object p3, p4, Lcom/google/android/gms/internal/measurement/zzfx;->zzayo:[J

    array-length v3, p3

    move v4, v2

    move v5, v4

    :goto_0
    if-ge v4, v3, :cond_2

    aget-wide v6, p3, v4

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    if-eqz v5, :cond_1

    const-string v5, ", "

    .line 215
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    :cond_1
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    move v5, v7

    goto :goto_0

    .line 218
    :cond_2
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 219
    :cond_3
    iget-object p3, p4, Lcom/google/android/gms/internal/measurement/zzfx;->zzayn:[J

    if-eqz p3, :cond_6

    .line 220
    invoke-static {p1, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    const-string/jumbo p3, "status: "

    .line 221
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    iget-object p3, p4, Lcom/google/android/gms/internal/measurement/zzfx;->zzayn:[J

    array-length v3, p3

    move v4, v2

    move v5, v4

    :goto_1
    if-ge v4, v3, :cond_5

    aget-wide v6, p3, v4

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    if-eqz v5, :cond_4

    const-string v5, ", "

    .line 225
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    :cond_4
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    move v5, v7

    goto :goto_1

    .line 228
    :cond_5
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 229
    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgv()Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object p3

    invoke-virtual {p3, p5}, Lcom/google/android/gms/measurement/internal/zzq;->zzbb(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_e

    .line 230
    iget-object p3, p4, Lcom/google/android/gms/internal/measurement/zzfx;->zzayp:[Lcom/google/android/gms/internal/measurement/zzfs;

    if-eqz p3, :cond_9

    .line 231
    invoke-static {p1, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    const-string p3, "dynamic_filter_timestamps: {"

    .line 232
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    iget-object p3, p4, Lcom/google/android/gms/internal/measurement/zzfx;->zzayp:[Lcom/google/android/gms/internal/measurement/zzfs;

    array-length p5, p3

    move v0, v2

    move v3, v0

    :goto_2
    if-ge v0, p5, :cond_8

    aget-object v4, p3, v0

    add-int/lit8 v5, v3, 0x1

    if-eqz v3, :cond_7

    const-string v3, ", "

    .line 236
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    :cond_7
    iget-object v3, v4, Lcom/google/android/gms/internal/measurement/zzfs;->zzawx:Ljava/lang/Integer;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ":"

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v4, Lcom/google/android/gms/internal/measurement/zzfs;->zzawy:Ljava/lang/Long;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    move v3, v5

    goto :goto_2

    :cond_8
    const-string/jumbo p3, "}\n"

    .line 239
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    :cond_9
    iget-object p3, p4, Lcom/google/android/gms/internal/measurement/zzfx;->zzayq:[Lcom/google/android/gms/internal/measurement/zzfy;

    if-eqz p3, :cond_e

    .line 241
    invoke-static {p1, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    const-string p3, "sequence_filter_timestamps: {"

    .line 242
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    iget-object p3, p4, Lcom/google/android/gms/internal/measurement/zzfx;->zzayq:[Lcom/google/android/gms/internal/measurement/zzfy;

    array-length p4, p3

    move p5, v2

    move v0, p5

    :goto_3
    if-ge p5, p4, :cond_d

    aget-object v1, p3, p5

    add-int/lit8 v3, v0, 0x1

    if-eqz v0, :cond_a

    const-string v0, ", "

    .line 246
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    :cond_a
    iget-object v0, v1, Lcom/google/android/gms/internal/measurement/zzfy;->zzawx:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ": ["

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    iget-object v0, v1, Lcom/google/android/gms/internal/measurement/zzfy;->zzays:[J

    array-length v1, v0

    move v4, v2

    move v5, v4

    :goto_4
    if-ge v4, v1, :cond_c

    aget-wide v6, v0, v4

    add-int/lit8 v8, v5, 0x1

    if-eqz v5, :cond_b

    const-string v5, ", "

    .line 251
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    :cond_b
    invoke-virtual {p1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    move v5, v8

    goto :goto_4

    :cond_c
    const-string v0, "]"

    .line 254
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p5, p5, 0x1

    move v0, v3

    goto :goto_3

    :cond_d
    const-string/jumbo p3, "}\n"

    .line 256
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    :cond_e
    invoke-static {p1, p2}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    const-string/jumbo p2, "}\n"

    .line 258
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_0

    return-void

    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 332
    invoke-static {p0, p1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    .line 333
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    .line 334
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    .line 336
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method static zza([JI)Z
    .locals 6

    .line 363
    array-length v0, p0

    shl-int/lit8 v0, v0, 0x6

    const/4 v1, 0x0

    if-lt p1, v0, :cond_0

    return v1

    .line 365
    :cond_0
    div-int/lit8 v0, p1, 0x40

    aget-wide v2, p0, v0

    const-wide/16 v4, 0x1

    rem-int/lit8 p1, p1, 0x40

    shl-long p0, v4, p1

    and-long/2addr p0, v2

    const-wide/16 v2, 0x0

    cmp-long p0, p0, v2

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v1
.end method

.method static zza(Ljava/util/BitSet;)[J
    .locals 10

    .line 366
    invoke-virtual {p0}, Ljava/util/BitSet;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x3f

    const/16 v1, 0x40

    div-int/2addr v0, v1

    .line 367
    new-array v2, v0, [J

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v0, :cond_2

    const-wide/16 v5, 0x0

    .line 369
    aput-wide v5, v2, v4

    move v5, v3

    :goto_1
    if-ge v5, v1, :cond_1

    shl-int/lit8 v6, v4, 0x6

    add-int/2addr v6, v5

    .line 371
    invoke-virtual {p0}, Ljava/util/BitSet;->length()I

    move-result v7

    if-ge v6, v7, :cond_1

    .line 372
    invoke-virtual {p0, v6}, Ljava/util/BitSet;->get(I)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 373
    aget-wide v6, v2, v4

    const-wide/16 v8, 0x1

    shl-long/2addr v8, v5

    or-long/2addr v6, v8

    aput-wide v6, v2, v4

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    return-object v2
.end method

.method static zza([Lcom/google/android/gms/internal/measurement/zzfu;Ljava/lang/String;Ljava/lang/Object;)[Lcom/google/android/gms/internal/measurement/zzfu;
    .locals 5

    .line 53
    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_4

    aget-object v3, p0, v2

    .line 54
    iget-object v4, v3, Lcom/google/android/gms/internal/measurement/zzfu;->name:Ljava/lang/String;

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 p1, 0x0

    .line 55
    iput-object p1, v3, Lcom/google/android/gms/internal/measurement/zzfu;->zzaxe:Ljava/lang/Long;

    .line 56
    iput-object p1, v3, Lcom/google/android/gms/internal/measurement/zzfu;->zzaml:Ljava/lang/String;

    .line 57
    iput-object p1, v3, Lcom/google/android/gms/internal/measurement/zzfu;->zzaun:Ljava/lang/Double;

    .line 58
    instance-of p1, p2, Ljava/lang/Long;

    if-eqz p1, :cond_0

    .line 59
    check-cast p2, Ljava/lang/Long;

    iput-object p2, v3, Lcom/google/android/gms/internal/measurement/zzfu;->zzaxe:Ljava/lang/Long;

    goto :goto_1

    .line 60
    :cond_0
    instance-of p1, p2, Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 61
    check-cast p2, Ljava/lang/String;

    iput-object p2, v3, Lcom/google/android/gms/internal/measurement/zzfu;->zzaml:Ljava/lang/String;

    goto :goto_1

    .line 62
    :cond_1
    instance-of p1, p2, Ljava/lang/Double;

    if-eqz p1, :cond_2

    .line 63
    check-cast p2, Ljava/lang/Double;

    iput-object p2, v3, Lcom/google/android/gms/internal/measurement/zzfu;->zzaun:Ljava/lang/Double;

    :cond_2
    :goto_1
    return-object p0

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 66
    :cond_4
    array-length v0, p0

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/measurement/zzfu;

    .line 67
    array-length v2, p0

    invoke-static {p0, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 68
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzfu;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zzfu;-><init>()V

    .line 69
    iput-object p1, v1, Lcom/google/android/gms/internal/measurement/zzfu;->name:Ljava/lang/String;

    .line 70
    instance-of p1, p2, Ljava/lang/Long;

    if-eqz p1, :cond_5

    .line 71
    check-cast p2, Ljava/lang/Long;

    iput-object p2, v1, Lcom/google/android/gms/internal/measurement/zzfu;->zzaxe:Ljava/lang/Long;

    goto :goto_2

    .line 72
    :cond_5
    instance-of p1, p2, Ljava/lang/String;

    if-eqz p1, :cond_6

    .line 73
    check-cast p2, Ljava/lang/String;

    iput-object p2, v1, Lcom/google/android/gms/internal/measurement/zzfu;->zzaml:Ljava/lang/String;

    goto :goto_2

    .line 74
    :cond_6
    instance-of p1, p2, Ljava/lang/Double;

    if-eqz p1, :cond_7

    .line 75
    check-cast p2, Ljava/lang/Double;

    iput-object p2, v1, Lcom/google/android/gms/internal/measurement/zzfu;->zzaun:Ljava/lang/Double;

    .line 76
    :cond_7
    :goto_2
    array-length p0, p0

    aput-object v1, v0, p0

    return-object v0
.end method

.method static zzb(Lcom/google/android/gms/internal/measurement/zzft;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 44
    invoke-static {p0, p1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Lcom/google/android/gms/internal/measurement/zzft;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfu;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 46
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzfu;->zzaml:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 47
    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzfu;->zzaml:Ljava/lang/String;

    return-object p0

    .line 48
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzfu;->zzaxe:Ljava/lang/Long;

    if-eqz p1, :cond_1

    .line 49
    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzfu;->zzaxe:Ljava/lang/Long;

    return-object p0

    .line 50
    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzfu;->zzaun:Ljava/lang/Double;

    if-eqz p1, :cond_2

    .line 51
    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzfu;->zzaun:Ljava/lang/Double;

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method static zzcs(Ljava/lang/String;)Z
    .locals 1

    if-eqz p0, :cond_0

    const-string v0, "([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)"

    .line 360
    invoke-virtual {p0, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 361
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    const/16 v0, 0x136

    if-gt p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final bridge synthetic getContext()Landroid/content/Context;
    .locals 1

    .line 439
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/zzfn;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method final zza([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroid/os/Parcelable;",
            ">([B",
            "Landroid/os/Parcelable$Creator<",
            "TT;>;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 340
    :cond_0
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    .line 341
    :try_start_0
    array-length v2, p1

    const/4 v3, 0x0

    invoke-virtual {v1, p1, v3, v2}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 342
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 343
    invoke-interface {p2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Parcelable;
    :try_end_0
    .catch Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 344
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 347
    :catch_0
    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjg()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object p1

    const-string p2, "Failed to load parcelable from buffer"

    invoke-virtual {p1, p2}, Lcom/google/android/gms/measurement/internal/zzau;->zzby(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 348
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    return-object v0

    .line 350
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    throw p1
.end method

.method final zza(Lcom/google/android/gms/internal/measurement/zzfj;)Ljava/lang/String;
    .locals 6

    if-nez p1, :cond_0

    const-string p1, "null"

    return-object p1

    .line 181
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\nevent_filter {\n"

    .line 182
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "filter_id"

    .line 183
    iget-object v2, p1, Lcom/google/android/gms/internal/measurement/zzfj;->zzavk:Ljava/lang/Integer;

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v1, "event_name"

    .line 184
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object v2

    iget-object v4, p1, Lcom/google/android/gms/internal/measurement/zzfj;->zzavl:Ljava/lang/String;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v3, v1, v2}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v1, "event_count_filter"

    .line 185
    iget-object v2, p1, Lcom/google/android/gms/internal/measurement/zzfj;->zzavo:Lcom/google/android/gms/internal/measurement/zzfl;

    const/4 v4, 0x1

    invoke-direct {p0, v0, v4, v1, v2}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Lcom/google/android/gms/internal/measurement/zzfl;)V

    const-string v1, "  filters {\n"

    .line 186
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzfj;->zzavm:[Lcom/google/android/gms/internal/measurement/zzfk;

    array-length v1, p1

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v2, p1, v3

    const/4 v5, 0x2

    .line 188
    invoke-direct {p0, v0, v5, v2}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILcom/google/android/gms/internal/measurement/zzfk;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 190
    :cond_1
    invoke-static {v0, v4}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    const-string/jumbo p1, "}\n}\n"

    .line 191
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method final zza(Lcom/google/android/gms/internal/measurement/zzfm;)Ljava/lang/String;
    .locals 5

    if-nez p1, :cond_0

    const-string p1, "null"

    return-object p1

    .line 195
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\nproperty_filter {\n"

    .line 196
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "filter_id"

    .line 197
    iget-object v2, p1, Lcom/google/android/gms/internal/measurement/zzfm;->zzavk:Ljava/lang/Integer;

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v1, "property_name"

    .line 199
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object v2

    iget-object v4, p1, Lcom/google/android/gms/internal/measurement/zzfm;->zzawa:Ljava/lang/String;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 200
    invoke-static {v0, v3, v1, v2}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const/4 v1, 0x1

    .line 201
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzfm;->zzawb:Lcom/google/android/gms/internal/measurement/zzfk;

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILcom/google/android/gms/internal/measurement/zzfk;)V

    const-string/jumbo p1, "}\n"

    .line 202
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method final zza(Lcom/google/android/gms/internal/measurement/zzfu;Ljava/lang/Object;)V
    .locals 1

    .line 16
    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 17
    iput-object v0, p1, Lcom/google/android/gms/internal/measurement/zzfu;->zzaml:Ljava/lang/String;

    .line 18
    iput-object v0, p1, Lcom/google/android/gms/internal/measurement/zzfu;->zzaxe:Ljava/lang/Long;

    .line 19
    iput-object v0, p1, Lcom/google/android/gms/internal/measurement/zzfu;->zzaun:Ljava/lang/Double;

    .line 20
    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 21
    check-cast p2, Ljava/lang/String;

    iput-object p2, p1, Lcom/google/android/gms/internal/measurement/zzfu;->zzaml:Ljava/lang/String;

    return-void

    .line 22
    :cond_0
    instance-of v0, p2, Ljava/lang/Long;

    if-eqz v0, :cond_1

    .line 23
    check-cast p2, Ljava/lang/Long;

    iput-object p2, p1, Lcom/google/android/gms/internal/measurement/zzfu;->zzaxe:Ljava/lang/Long;

    return-void

    .line 24
    :cond_1
    instance-of v0, p2, Ljava/lang/Double;

    if-eqz v0, :cond_2

    .line 25
    check-cast p2, Ljava/lang/Double;

    iput-object p2, p1, Lcom/google/android/gms/internal/measurement/zzfu;->zzaun:Ljava/lang/Double;

    return-void

    .line 26
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjg()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object p1

    const-string v0, "Ignoring invalid (type) event param value"

    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method final zza(Lcom/google/android/gms/internal/measurement/zzfz;Ljava/lang/Object;)V
    .locals 1

    .line 4
    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 5
    iput-object v0, p1, Lcom/google/android/gms/internal/measurement/zzfz;->zzaml:Ljava/lang/String;

    .line 6
    iput-object v0, p1, Lcom/google/android/gms/internal/measurement/zzfz;->zzaxe:Ljava/lang/Long;

    .line 7
    iput-object v0, p1, Lcom/google/android/gms/internal/measurement/zzfz;->zzaun:Ljava/lang/Double;

    .line 8
    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 9
    check-cast p2, Ljava/lang/String;

    iput-object p2, p1, Lcom/google/android/gms/internal/measurement/zzfz;->zzaml:Ljava/lang/String;

    return-void

    .line 10
    :cond_0
    instance-of v0, p2, Ljava/lang/Long;

    if-eqz v0, :cond_1

    .line 11
    check-cast p2, Ljava/lang/Long;

    iput-object p2, p1, Lcom/google/android/gms/internal/measurement/zzfz;->zzaxe:Ljava/lang/Long;

    return-void

    .line 12
    :cond_1
    instance-of v0, p2, Ljava/lang/Double;

    if-eqz v0, :cond_2

    .line 13
    check-cast p2, Ljava/lang/Double;

    iput-object p2, p1, Lcom/google/android/gms/internal/measurement/zzfz;->zzaun:Ljava/lang/Double;

    return-void

    .line 14
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjg()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object p1

    const-string v0, "Ignoring invalid (type) user attribute value"

    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method final zza(Lcom/google/android/gms/internal/measurement/zzfv;)[B
    .locals 3

    .line 28
    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzyi;->zzvx()I

    move-result v0

    .line 29
    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 31
    array-length v2, v0

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzya;->zzk([BII)Lcom/google/android/gms/internal/measurement/zzya;

    move-result-object v1

    .line 33
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzyi;->zza(Lcom/google/android/gms/internal/measurement/zzya;)V

    .line 34
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzya;->zzza()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 37
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjg()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "Data loss. Failed to serialize batch"

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method final zza([B)[B
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 380
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 381
    new-instance p1, Ljava/util/zip/GZIPInputStream;

    invoke-direct {p1, v0}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 382
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v2, 0x400

    .line 383
    new-array v2, v2, [B

    .line 384
    :goto_0
    invoke-virtual {p1, v2}, Ljava/util/zip/GZIPInputStream;->read([B)I

    move-result v3

    if-lez v3, :cond_0

    const/4 v4, 0x0

    .line 386
    invoke-virtual {v1, v2, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 388
    :cond_0
    invoke-virtual {p1}, Ljava/util/zip/GZIPInputStream;->close()V

    .line 389
    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->close()V

    .line 390
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 392
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjg()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "Failed to ungzip content"

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    .line 393
    throw p1
.end method

.method public final bridge synthetic zzaf()V
    .locals 0

    .line 436
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/zzfn;->zzaf()V

    return-void
.end method

.method final zzb(Lcom/google/android/gms/internal/measurement/zzfv;)Ljava/lang/String;
    .locals 18

    move-object/from16 v0, p1

    .line 78
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\nbatch {\n"

    .line 79
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzfv;->zzaxf:[Lcom/google/android/gms/internal/measurement/zzfw;

    if-eqz v1, :cond_c

    .line 81
    iget-object v7, v0, Lcom/google/android/gms/internal/measurement/zzfv;->zzaxf:[Lcom/google/android/gms/internal/measurement/zzfw;

    array-length v8, v7

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v8, :cond_c

    aget-object v11, v7, v10

    if-eqz v11, :cond_b

    if-eqz v11, :cond_b

    const/4 v12, 0x1

    .line 85
    invoke-static {v6, v12}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    const-string v0, "bundle {\n"

    .line 86
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "protocol_version"

    .line 87
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxh:Ljava/lang/Integer;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "platform"

    .line 88
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxp:Ljava/lang/String;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "gmp_version"

    .line 89
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxt:Ljava/lang/Long;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string/jumbo v0, "uploading_gmp_version"

    .line 90
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxu:Ljava/lang/Long;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "config_version"

    .line 91
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzayf:Ljava/lang/Long;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "gmp_app_id"

    .line 92
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzafi:Ljava/lang/String;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "admob_app_id"

    .line 93
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzawp:Ljava/lang/String;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "app_id"

    .line 94
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zztt:Ljava/lang/String;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "app_version"

    .line 95
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzts:Ljava/lang/String;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "app_version_major"

    .line 96
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzayb:Ljava/lang/Integer;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "firebase_instance_id"

    .line 97
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzafk:Ljava/lang/String;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "dev_cert_hash"

    .line 98
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxx:Ljava/lang/Long;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "app_store"

    .line 99
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzafp:Ljava/lang/String;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string/jumbo v0, "upload_timestamp_millis"

    .line 100
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxk:Ljava/lang/Long;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string/jumbo v0, "start_timestamp_millis"

    .line 101
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxl:Ljava/lang/Long;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "end_timestamp_millis"

    .line 102
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxm:Ljava/lang/Long;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "previous_bundle_start_timestamp_millis"

    .line 103
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxn:Ljava/lang/Long;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "previous_bundle_end_timestamp_millis"

    .line 104
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxo:Ljava/lang/Long;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "app_instance_id"

    .line 105
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzafh:Ljava/lang/String;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "resettable_device_id"

    .line 106
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxv:Ljava/lang/String;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "device_id"

    .line 107
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzaye:Ljava/lang/String;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "ds_id"

    .line 108
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzayh:Ljava/lang/String;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "limited_ad_tracking"

    .line 109
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxw:Ljava/lang/Boolean;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "os_version"

    .line 110
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxq:Ljava/lang/String;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "device_model"

    .line 111
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxr:Ljava/lang/String;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string/jumbo v0, "user_default_language"

    .line 112
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzahr:Ljava/lang/String;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string/jumbo v0, "time_zone_offset_minutes"

    .line 113
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxs:Ljava/lang/Integer;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "bundle_sequential_index"

    .line 114
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxy:Ljava/lang/Integer;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "service_upload"

    .line 115
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxz:Ljava/lang/Boolean;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "health_monitor"

    .line 116
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzagm:Ljava/lang/String;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 117
    iget-object v0, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzayg:Ljava/lang/Long;

    if-eqz v0, :cond_0

    iget-object v0, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzayg:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const-string v0, "android_id"

    .line 118
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzayg:Ljava/lang/Long;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 119
    :cond_0
    iget-object v0, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzayj:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    const-string v0, "retry_counter"

    .line 120
    iget-object v1, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzayj:Ljava/lang/Integer;

    invoke-static {v6, v12, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 121
    :cond_1
    iget-object v0, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxj:[Lcom/google/android/gms/internal/measurement/zzfz;

    const/4 v13, 0x2

    if-eqz v0, :cond_3

    .line 123
    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_3

    aget-object v3, v0, v2

    if-eqz v3, :cond_2

    .line 125
    invoke-static {v6, v13}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    const-string/jumbo v4, "user_property {\n"

    .line 126
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v4, "set_timestamp_millis"

    .line 127
    iget-object v5, v3, Lcom/google/android/gms/internal/measurement/zzfz;->zzayu:Ljava/lang/Long;

    invoke-static {v6, v13, v4, v5}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v4, "name"

    .line 128
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object v5

    iget-object v14, v3, Lcom/google/android/gms/internal/measurement/zzfz;->name:Ljava/lang/String;

    invoke-virtual {v5, v14}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v13, v4, v5}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string/jumbo v4, "string_value"

    .line 129
    iget-object v5, v3, Lcom/google/android/gms/internal/measurement/zzfz;->zzaml:Ljava/lang/String;

    invoke-static {v6, v13, v4, v5}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v4, "int_value"

    .line 130
    iget-object v5, v3, Lcom/google/android/gms/internal/measurement/zzfz;->zzaxe:Ljava/lang/Long;

    invoke-static {v6, v13, v4, v5}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v4, "double_value"

    .line 131
    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzfz;->zzaun:Ljava/lang/Double;

    invoke-static {v6, v13, v4, v3}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 132
    invoke-static {v6, v13}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    const-string/jumbo v3, "}\n"

    .line 133
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 135
    :cond_3
    iget-object v14, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzaya:[Lcom/google/android/gms/internal/measurement/zzfr;

    iget-object v15, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zztt:Ljava/lang/String;

    if-eqz v14, :cond_5

    .line 137
    array-length v5, v14

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v5, :cond_5

    aget-object v3, v14, v4

    if-eqz v3, :cond_4

    .line 139
    invoke-static {v6, v13}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    const-string v0, "audience_membership {\n"

    .line 140
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "audience_id"

    .line 141
    iget-object v1, v3, Lcom/google/android/gms/internal/measurement/zzfr;->zzave:Ljava/lang/Integer;

    invoke-static {v6, v13, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v0, "new_audience"

    .line 142
    iget-object v1, v3, Lcom/google/android/gms/internal/measurement/zzfr;->zzawv:Ljava/lang/Boolean;

    invoke-static {v6, v13, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const/4 v2, 0x2

    const-string v16, "current_data"

    .line 143
    iget-object v1, v3, Lcom/google/android/gms/internal/measurement/zzfr;->zzawt:Lcom/google/android/gms/internal/measurement/zzfx;

    move-object/from16 v0, p0

    move-object/from16 v17, v1

    move-object v1, v6

    move-object v9, v3

    move-object/from16 v3, v16

    move/from16 v16, v4

    move-object/from16 v4, v17

    move/from16 v17, v5

    move-object v5, v15

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Lcom/google/android/gms/internal/measurement/zzfx;Ljava/lang/String;)V

    const-string v3, "previous_data"

    .line 144
    iget-object v4, v9, Lcom/google/android/gms/internal/measurement/zzfr;->zzawu:Lcom/google/android/gms/internal/measurement/zzfx;

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Lcom/google/android/gms/internal/measurement/zzfx;Ljava/lang/String;)V

    .line 145
    invoke-static {v6, v13}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    const-string/jumbo v0, "}\n"

    .line 146
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_4
    move/from16 v16, v4

    move/from16 v17, v5

    :goto_3
    add-int/lit8 v4, v16, 0x1

    move/from16 v5, v17

    goto :goto_2

    .line 148
    :cond_5
    iget-object v0, v11, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxi:[Lcom/google/android/gms/internal/measurement/zzft;

    if-eqz v0, :cond_a

    .line 150
    array-length v1, v0

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v1, :cond_9

    aget-object v3, v0, v2

    if-eqz v3, :cond_8

    .line 152
    invoke-static {v6, v13}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    const-string v4, "event {\n"

    .line 153
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "name"

    .line 154
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object v5

    iget-object v9, v3, Lcom/google/android/gms/internal/measurement/zzft;->name:Ljava/lang/String;

    invoke-virtual {v5, v9}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v13, v4, v5}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string/jumbo v4, "timestamp_millis"

    .line 155
    iget-object v5, v3, Lcom/google/android/gms/internal/measurement/zzft;->zzaxb:Ljava/lang/Long;

    invoke-static {v6, v13, v4, v5}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v4, "previous_timestamp_millis"

    .line 156
    iget-object v5, v3, Lcom/google/android/gms/internal/measurement/zzft;->zzaxc:Ljava/lang/Long;

    invoke-static {v6, v13, v4, v5}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v4, "count"

    .line 157
    iget-object v5, v3, Lcom/google/android/gms/internal/measurement/zzft;->count:Ljava/lang/Integer;

    invoke-static {v6, v13, v4, v5}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 158
    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzft;->zzaxa:[Lcom/google/android/gms/internal/measurement/zzfu;

    if-eqz v3, :cond_7

    .line 160
    array-length v4, v3

    const/4 v5, 0x0

    :goto_5
    if-ge v5, v4, :cond_7

    aget-object v9, v3, v5

    if-eqz v9, :cond_6

    const/4 v11, 0x3

    .line 162
    invoke-static {v6, v11}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    const-string v14, "param {\n"

    .line 163
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, "name"

    .line 164
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object v15

    iget-object v12, v9, Lcom/google/android/gms/internal/measurement/zzfu;->name:Ljava/lang/String;

    invoke-virtual {v15, v12}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbu(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v6, v11, v14, v12}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string/jumbo v12, "string_value"

    .line 165
    iget-object v14, v9, Lcom/google/android/gms/internal/measurement/zzfu;->zzaml:Ljava/lang/String;

    invoke-static {v6, v11, v12, v14}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v12, "int_value"

    .line 166
    iget-object v14, v9, Lcom/google/android/gms/internal/measurement/zzfu;->zzaxe:Ljava/lang/Long;

    invoke-static {v6, v11, v12, v14}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v12, "double_value"

    .line 167
    iget-object v9, v9, Lcom/google/android/gms/internal/measurement/zzfu;->zzaun:Ljava/lang/Double;

    invoke-static {v6, v11, v12, v9}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 168
    invoke-static {v6, v11}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    const-string/jumbo v9, "}\n"

    .line 169
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    add-int/lit8 v5, v5, 0x1

    const/4 v12, 0x1

    goto :goto_5

    .line 171
    :cond_7
    invoke-static {v6, v13}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    const-string/jumbo v3, "}\n"

    .line 172
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    add-int/lit8 v2, v2, 0x1

    const/4 v12, 0x1

    goto/16 :goto_4

    :cond_9
    move v0, v12

    goto :goto_6

    :cond_a
    move v0, v12

    .line 174
    :goto_6
    invoke-static {v6, v0}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/StringBuilder;I)V

    const-string/jumbo v0, "}\n"

    .line 175
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_b
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    :cond_c
    const-string/jumbo v0, "}\n"

    .line 177
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method final zzb(JJ)Z
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    cmp-long v0, p3, v0

    if-gtz v0, :cond_0

    goto :goto_0

    .line 379
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzbx()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide p1

    cmp-long p1, p1, p3

    if-lez p1, :cond_1

    return v3

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    return v3
.end method

.method final zzb([B)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 394
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 395
    new-instance v1, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v1, v0}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 396
    invoke-virtual {v1, p1}, Ljava/util/zip/GZIPOutputStream;->write([B)V

    .line 397
    invoke-virtual {v1}, Ljava/util/zip/GZIPOutputStream;->close()V

    .line 398
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 399
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 401
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjg()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "Failed to gzip content"

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    .line 402
    throw p1
.end method

.method public final bridge synthetic zzbx()Lcom/google/android/gms/common/util/Clock;
    .locals 1

    .line 438
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/zzfn;->zzbx()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    return-object v0
.end method

.method final zze(Lcom/google/android/gms/measurement/internal/zzag;Lcom/google/android/gms/measurement/internal/zzk;)Z
    .locals 0
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 351
    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    iget-object p1, p2, Lcom/google/android/gms/measurement/internal/zzk;->zzafi:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p2, Lcom/google/android/gms/measurement/internal/zzk;->zzafv:Ljava/lang/String;

    .line 354
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 355
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgw()Lcom/google/android/gms/measurement/internal/zzn;

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final bridge synthetic zzgf()V
    .locals 0

    .line 433
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/zzfn;->zzgf()V

    return-void
.end method

.method public final bridge synthetic zzgg()V
    .locals 0

    .line 434
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/zzfn;->zzgg()V

    return-void
.end method

.method public final bridge synthetic zzgh()V
    .locals 0

    .line 435
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/zzfn;->zzgh()V

    return-void
.end method

.method public final bridge synthetic zzgp()Lcom/google/android/gms/measurement/internal/zzaa;
    .locals 1

    .line 437
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/zzfn;->zzgp()Lcom/google/android/gms/measurement/internal/zzaa;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzgq()Lcom/google/android/gms/measurement/internal/zzaq;
    .locals 1

    .line 440
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/zzfn;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzgr()Lcom/google/android/gms/measurement/internal/zzfy;
    .locals 1

    .line 441
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/zzfn;->zzgr()Lcom/google/android/gms/measurement/internal/zzfy;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzgs()Lcom/google/android/gms/measurement/internal/zzbr;
    .locals 1

    .line 442
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/zzfn;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzgt()Lcom/google/android/gms/measurement/internal/zzas;
    .locals 1

    .line 443
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/zzfn;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzgu()Lcom/google/android/gms/measurement/internal/zzbd;
    .locals 1

    .line 444
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/zzfn;->zzgu()Lcom/google/android/gms/measurement/internal/zzbd;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzgv()Lcom/google/android/gms/measurement/internal/zzq;
    .locals 1

    .line 445
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/zzfn;->zzgv()Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzgw()Lcom/google/android/gms/measurement/internal/zzn;
    .locals 1

    .line 446
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/zzfn;->zzgw()Lcom/google/android/gms/measurement/internal/zzn;

    move-result-object v0

    return-object v0
.end method

.method protected final zzgy()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final bridge synthetic zzjr()Lcom/google/android/gms/measurement/internal/zzfu;
    .locals 1

    .line 430
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/zzfn;->zzjr()Lcom/google/android/gms/measurement/internal/zzfu;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzjs()Lcom/google/android/gms/measurement/internal/zzm;
    .locals 1

    .line 431
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/zzfn;->zzjs()Lcom/google/android/gms/measurement/internal/zzm;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzjt()Lcom/google/android/gms/measurement/internal/zzt;
    .locals 1

    .line 432
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/zzfn;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v0

    return-object v0
.end method

.method final zzmi()[I
    .locals 7
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 403
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzfu;->zzamv:Lcom/google/android/gms/measurement/internal/zzfo;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfo;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzai;->zzm(Landroid/content/Context;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    .line 404
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_3

    .line 406
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 407
    sget-object v3, Lcom/google/android/gms/measurement/internal/zzai;->zzakg:Lcom/google/android/gms/measurement/internal/zzai$zza;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzai$zza;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 408
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 409
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const-string v6, "measurement.id."

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 410
    :try_start_0
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    if-eqz v4, :cond_1

    .line 412
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 413
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-lt v4, v3, :cond_1

    .line 414
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v4

    .line 415
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v4

    const-string v5, "Too many experiment IDs. Number of IDs"

    .line 416
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v4

    .line 420
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v5

    const-string v6, "Experiment ID NumberFormatException"

    invoke-virtual {v5, v6, v4}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 422
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    return-object v1

    .line 424
    :cond_3
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [I

    .line 426
    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x0

    move v4, v3

    :goto_2
    if-ge v3, v1, :cond_4

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v3, v3, 0x1

    check-cast v5, Ljava/lang/Integer;

    add-int/lit8 v6, v4, 0x1

    .line 427
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    aput v5, v0, v4

    move v4, v6

    goto :goto_2

    :cond_4
    return-object v0

    :cond_5
    :goto_3
    return-object v1
.end method
